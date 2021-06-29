package filehandler;


import java.io.*;
import java.util.*;


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












}