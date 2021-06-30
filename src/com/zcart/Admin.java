package com.zcart;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.protobuf.Message;
import filehandler.*;
import proto.example.Schema.Customer;
import proto.example.Schema.Customers;
import proto.example.Schema.Product;
import proto.example.Schema.Products;


public class Admin {

    FileHandler filehandler=new FileHandler();
    Scanner scan=new Scanner(System.in);
    String usersFilePath = "./file_db/customer";
    String recentPasswordFilePath = "./file_db/password";


    public void displayCurrentStockDetails() // Displaying the current  all products details
    {




        System.out.println("----------------WELCOME TO THE ADMIN SECTION---------------------");
        System.out.println();
        System.out.println("-----------LIST OF ITEMS  AND THE CURRENT STOCK-------------------");
        System.out.println();
        System.out.println("BRAND   "+"    MODEL   "+"    STOCK  " );
        System.out.println();

        Products.Builder products=filehandler.readFileDataProduct();
        int size=products.getProductsCount();
        boolean flag=true;
        for(int i=0;i<size;i++)
        {
            if(products.getProducts(i).getStock()<10)
            {
                flag=false;
                System.out.println(products.getProducts(i).getBrand()+"     "+products.getProducts(i).getModel()+"           "+products.getProducts(i).getStock());
            }
        }

        if(flag)
        {
            System.out.println("----------------ALL PRODUCT IS AVAILABLE WITH MORE THAN 10 STOCK---------------------");
            System.out.println();
        }


    }


    public boolean adminDefault_PasswordChanger() // default password changer for admin // task -7
    {

        String firstPassword;
        String secondPassword;
        System.out.println("--WELCOME TO THE ADMIN SECTION---");
        System.out.println("For Security Purpose Kindly change Your Password and relogin again");
        System.out.println("Enter new password");
        firstPassword=scan.next();
        System.out.println("Enter password again");
        secondPassword=scan.next();
        PasswordVerifier passswordVerifier =new PasswordVerifier();

        if(!passswordVerifier.passwordValidChecker(firstPassword,secondPassword)) // checking of the password validity
        {
            return false;
        }
        else
        {
            System.out.println("Password match successfully!");

        }

        firstPassword = passswordVerifier.encryptPassword(firstPassword);// encryption of password is done here



        Customers.Builder customers=filehandler.readFileDataCustomer();  // reading the data of the user data file
        int size=customers.getCustomersCount();
        for(int i=0;i<size;i++)
        {
            if(customers.getCustomers(i).getName().equals("Admin"))
            {

                Customer.Builder customer=Customer.newBuilder();
                customer.mergeFrom(customers.getCustomers(i));
                customer.setPassword(firstPassword);
                customers.setCustomers(i,customer);

   //             System.out.println(customers.getCustomers(i).toString());
                String passwordFilePath = "./file_db/password";
                filehandler.addUser(customer,passwordFilePath);
                String userFilePath = "./file_db/customer";

                try {
                    FileOutputStream outputFile= new FileOutputStream(userFilePath);
                    customers.build().writeTo(outputFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;

            }
        }


        return  true;

    }





    public void adminUpdateStock() // function for updating stock by the Admin
    {
        String brandname=null;
        String modelname=null;
        System.out.println("Enter the Brand Name and Model");
        brandname=scan.next();
        modelname=scan.next();
        int stockvalue=0;
        System.out.println("How many stock you want to add in  "+brandname);
        stockvalue=scan.nextInt();
        boolean flag=true;


        Products.Builder products=filehandler.readFileDataProduct();  // reading the data of the user data file
        int size=products.getProductsCount();
        for(int i=0;i<size;i++)
        {
            if(products.getProducts(i).getModel().equalsIgnoreCase(modelname)  && products.getProducts(i).getBrand().equalsIgnoreCase(brandname) )
            {
                flag=false;
                Product.Builder product=Product.newBuilder();
                product.mergeFrom(products.getProducts(i));
                product.setStock(stockvalue);
                products.setProducts(i,product);

                String userFilePath = "./file_db/product";

                try {
                    FileOutputStream outputFile= new FileOutputStream(userFilePath);
                    products.build().writeTo(outputFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;

            }
        }



        if(flag)
        {
            System.out.println("Data not founded please write proper name");
            return;
        }


        return;


    }



}