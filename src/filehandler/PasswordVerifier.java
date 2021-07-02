package filehandler;


import proto.example.Schema.Customer;
import proto.example.Schema.Customers;

import java.io.*;
import java.util.*;

/*
   PasswordVerifier class deals with all the password releated task
   1.Encryption of code
   2.Password valid checker to check whether password follows the given condition-like password must
     have 2 number ,2 uppercase letter and 2 lower case letter
   3.Password changer method is used to update latest password to the customer file
   4.PasswordUpdate method deals with the all the password changes related inputs

 */

public class PasswordVerifier {

    Scanner scan=new Scanner(System.in);
    FileHandler filehandler =new FileHandler();



    public String encryptPassword(String password){      // password encryption //

        StringBuffer result= new StringBuffer();

        //Applying ciserCipher algorithm for password Encryption

        for (int i=0; i<password.length(); i++)
        {
            if (Character.isUpperCase(password.charAt(i)))
            {
                char ch = (char)(((int)password.charAt(i) + 1 - 65) % 26 + 65);
                result.append(ch);
            }
            else if(password.charAt(i)>='0' && password.charAt(i)<='9')
            {
                char ch;
                int ch1=password.charAt(i)+1;
                if(ch1==58)
                {
                    ch='0';
                }
                else
                {
                    ch=(char)ch1;
                }
                result.append(ch);

            }
            else
            {
                char ch = (char)(((int)password.charAt(i) + 1 - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public boolean passwordValidChecker(String firstPassword ,String secondPassword)
    {
        int firstPasswordSize=firstPassword.length();
        int secondPasswordSize=secondPassword.length();

        if(firstPassword.length()!=secondPassword.length() || firstPasswordSize<6  || secondPasswordSize<6)
        {
            return  false;
        }

        int firstPassword_UpperCounter = 0, firstPassword_LowerCounter = 0, firstPassword_NumberCounter = 0;
        int secondPassword_UpperCounter = 0, secondPassword_LowerCounter = 0, secondPassword_NumberCounter = 0;



        for(int i = 0; i < firstPasswordSize; i++)
        {
            char chfirst  = firstPassword.charAt(i);
            char chsecond = secondPassword.charAt(i);

            if (chfirst >= 'A' && chfirst <= 'Z')
                firstPassword_UpperCounter++;
            else if (chfirst >= 'a' && chfirst <= 'z')
                firstPassword_LowerCounter++;
            else if (chfirst >= '0' && chfirst <= '9')
                firstPassword_NumberCounter++;

            if(chsecond >= 'A' && chsecond <= 'Z')
                secondPassword_UpperCounter++;
            else if (chfirst >= 'a' && chfirst <= 'z')
                secondPassword_LowerCounter++;
            else if (chfirst >= '0' && chfirst <= '9')
                secondPassword_NumberCounter++;


        }


        if(firstPassword_LowerCounter<2  || firstPassword_NumberCounter<2 || firstPassword_UpperCounter<2)
        {
            return false;
        }
        else if(secondPassword_LowerCounter<2  || secondPassword_NumberCounter<2 || secondPassword_UpperCounter<2)
        {
            return false;
        }

        boolean flag = true;
        for (int i = 0; i < firstPasswordSize; i++) {
            if (firstPassword.charAt(i) != secondPassword.charAt(i)) {
                flag = false;
                break;
            }
        }
        if (!flag) {

            return false;
        }

        return true;

    }


    public void passwordChanger(String password,String email)  // password Changer
    {
        Customers.Builder customers=filehandler.readFileDataCustomer();


        int size=customers.getCustomersCount();
        boolean flag=false;
        for(int i=0;i<size;i++)
        {
            if(customers.getCustomers(i).getEmail().equalsIgnoreCase(email))
            {

                Customer.Builder customer=Customer.newBuilder();
                customer.mergeFrom(customers.getCustomers(i));
                customer.setPassword(password);
                customers.setCustomers(i,customer);
                String userFilePath = "./file_db/customer";

                try {
                    FileOutputStream outputFile= new FileOutputStream(userFilePath);
                    customers.build().writeTo(outputFile);
                    flag=true;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    System.out.println("Password is not updated");
                }

                break;

            }
        }


        if(flag)
        {
            System.out.println("Password change Successfully!");
        }
        else
        {
            System.out.println("Error in updating password");
        }

        return;

    }



    public void  passwordUpdate()   // updating the password
    {
        String email;
        String firstPassword;
        String secondPassword;
        String oldPassword;

        System.out.println("Enter Your Mail id");
        email = scan.next();
        email =email.toLowerCase();
        System.out.println("Enter Your old Password");
        oldPassword = scan.next();
        oldPassword =encryptPassword(oldPassword);

        if (filehandler.emailAndPasswordVerifier(email,oldPassword)) {

            System.out.println("Old password match successfully");

        }
        else
        {
            System.out.println("Either email or password is incorrect please try again");
            return;
        }


        System.out.println("Password complexity of mandating at least 2 lower case, 2 upper case and 2 numbers with a minimum length of 6");

        System.out.println("Enter Your Password");
        firstPassword = scan.next();


        System.out.println("Enter Password again");
        secondPassword = scan.next();


        if(!passwordValidChecker(firstPassword,secondPassword))
        {
            System.out.println("Password condition not match Try again!");
            return;
        }



        firstPassword=encryptPassword(firstPassword);

        Customers.Builder customersPassword=filehandler.readOldPassword();

        int size=customersPassword.getCustomersCount();
        int counter=0;
        String name = null;
        long mobileNumber = 0;

        for(int i=0;i<size;i++)
        {
            if(customersPassword.getCustomers(i).getEmail().equalsIgnoreCase(email))
            {
                name=customersPassword.getCustomers(i).getName();
                mobileNumber=customersPassword.getCustomers(i).getMobileNumber();
                int sizeobj=customersPassword.getCustomers(i).getPassword().length();
                if( (firstPassword.equals(customersPassword.getCustomers(i).getPassword()) ) && (sizeobj==firstPassword.length())) {

                    System.out.println("Password match with the old password!  Try new password again!");
                    return;
                }
                else
                {
                    counter++;
                }


            }

        }

   //     ArrayList<Customer>temperory=new ArrayList<Customer>();
        String usersFilePath = "./file_db/password";
        if(counter<3)
        {
            proto.example.Schema.Customer.Builder customer = proto.example.Schema.Customer.newBuilder();
            customer.setEmail(email);
            customer.setPassword(firstPassword);
            customer.setName(name);
            customer.setMobileNumber(mobileNumber);
            customer.setIsInitialCouponGenerated(0);

            filehandler.addUser(customer,usersFilePath);
        }
        else
        {
            boolean flag=true;
            for(int i=0;i<size;i++)
            {
                if(customersPassword.getCustomers(i).getEmail().equals(email) && flag)
                {
                    flag=false;
                    filehandler.fileDataVanisher(new File(usersFilePath));
                    continue;

                }
                else
                {
                    filehandler.addUser(customersPassword.getCustomers(i).toBuilder(),usersFilePath);

                }

            }

            if(flag==false)
            {
                proto.example.Schema.Customer.Builder customer = proto.example.Schema.Customer.newBuilder();
                customer.setEmail(email);
                customer.setPassword(firstPassword);
                customer.setName(name);
                customer.setMobileNumber(mobileNumber);
                customer.setIsInitialCouponGenerated(0);

                filehandler.addUser(customer,usersFilePath);
            }

        }

        passwordChanger(firstPassword,email);

    }













}