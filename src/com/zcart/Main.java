package com.zcart;

import filehandler.FileHandler;
import filehandler.PasswordVerifier;

import java.util.InputMismatchException;
import java.util.Scanner;
import product.Shopping;
import proto.example.Schema.Product;
import proto.example.Schema.Products;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DataHandler data=new DataHandler();
        data.showHistoryDataFile();

//        data.addIds();
//        data.showIdTracker();

        char choice;
        String usersFilePath = "./file_db/customer";
        String recentPasswordFilePath = "./file_db/password";
        System.out.println("-----------------------");
        do {
            //  MAIN PAGE MENU
            System.out.println("WELCOME TO Z-KART");
            System.out.println("1:REGISTER");
            System.out.println("2:LOGIN");
            System.out.println("3:PASSWORD CHANGE");
            System.out.println("Q:Quit");
            choice = scan.next().charAt(0);
            switch (choice) {

                case '1':
                    // Register of the user email id
                    String email;
                    String firstPassword;
                    String secondPassword;
                    String name;
                    long mobileNumber = 0;
                    System.out.println("Enter Your Mail id");
                    email = scan.next();
                    email = email.toLowerCase();
                    FileHandler fileioworker = new FileHandler();

                    if (fileioworker.emailVerifier(email)) {
                        System.out.println("Email id already exist!. Try to login");
                        break;
                    }

                    System.out.println("Enter Your first Name");
                    name = scan.next();
                    scan.nextLine();

                    System.out.println("Enter Your Mobile Number");
                    try {
                        mobileNumber = scan.nextLong();

                    } catch (InputMismatchException e) {
                        System.out.print("Caution:-- Please enter number between 0-9\n");
                        scan.next();

                        break;
                    }

                    System.out.println("Password complexity of mandating at least 2 lower case, 2 upper case and 2 numbers with a minimum length of 6");

                    System.out.println("Enter Your Password");
                    firstPassword = scan.next();

                    System.out.println("Enter Password again");
                    secondPassword = scan.next();

                    PasswordVerifier passswordVerifier=new PasswordVerifier();
                    if(!passswordVerifier.passwordValidChecker(firstPassword,secondPassword))
                    {
                        System.out.println("Password condition not match Try again!");
                        break;
                    }
                    else
                    {
                        System.out.println("Password match successfully!");

                    }

                    firstPassword = passswordVerifier.encryptPassword(firstPassword);

                    proto.example.Schema.Customer.Builder customer = proto.example.Schema.Customer.newBuilder();
                    customer.setEmail(email);
                    customer.setPassword(firstPassword);
                    customer.setName(name);
                    customer.setMobileNumber(mobileNumber);

                    fileioworker.addUser(customer, usersFilePath);
                    fileioworker.addUser(customer, recentPasswordFilePath);

                    System.out.println(customer.getName() + " added successfully");
                    break;

                case '2':
                    String loginEmail;
                    String loginPassword;

                    System.out.println("Enter Your mail id");
                    loginEmail = scan.next();
                    loginEmail=loginEmail.toLowerCase();
                    System.out.println("Enter password");
                    loginPassword = scan.next();
                    PasswordVerifier passwordVerifier=new PasswordVerifier();
                    loginPassword = passwordVerifier.encryptPassword(loginPassword);
                    FileHandler fileHandler=new FileHandler();
                    Admin admin=new Admin();

                    if(fileHandler.adminChecker(loginEmail,loginPassword))
                    {

                        if( loginPassword.equals("yzaaz"))
                        {

                            if(!admin.adminDefault_PasswordChanger())
                            {
                                System.out.println("Password condition not match Try again!");
                                break;
                            }
                            else
                            {
                                System.out.println("Password change Successfully !");
                            }
                        }
                        else
                        {


                            admin.displayCurrentStockDetails();

                           int adminPersmission = 0;

                           do{
                                System.out.println("Want to Update stock and add product::--PRESS: 1   PRESS:2-QUIT");

                                try {
                                    adminPersmission=scan.nextInt();

                                } catch (InputMismatchException e) {
                                    System.out.print("Caution:-- Please enter number between 1-2\n");
                                    scan.next();

                                    continue;
                                }


                                if(adminPersmission==1)
                                {
                                    admin.adminUpdateStock();
                                }
                                else
                                {
                                    System.out.println("Thanks for checking out Stock ");
                                    System.out.println("-----------Z-KART-------------");
                                }
                            }while(adminPersmission!=2);

                        }


                    }
                    else if(fileHandler.emailAndPasswordVerifier(loginEmail,loginPassword))
                    {
                        Shopping shop=new Shopping();
                        shop.shoppingDetials(loginEmail);


                    }
                    else
                    {
                        System.out.println("Either Email not registed or Password is incorrect please try again");
                    }

                    break;

                case '3':
                    // CASE 3 FOR PASSWORD CHANGE
                    PasswordVerifier passwordVerifier1=new PasswordVerifier();
                    passwordVerifier1.passwordUpdate();
                    break;


            }


        }while(choice!='Q' && choice!='q');

        System.out.println("Logout Successfully!");






    }
}
