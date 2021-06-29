package filehandler;

import proto.example.Schema.Customer;
import proto.example.Schema.Customers;
import proto.example.Schema.Products;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {


    public void addUser(proto.example.Schema.Customer.Builder customer, String filePath) {

        try{
            FileInputStream inputFile = new FileInputStream(filePath);
            Customers.Builder customers = Customers.newBuilder();
            customers.mergeFrom(inputFile);
            customers.addCustomers(customer);

            FileOutputStream outputFile = new FileOutputStream(filePath);
            customers.build().writeTo(outputFile);
        } catch (IOException e)
        {
            System.out.println("Problem in adding data from file !");
        }
    }







    public boolean emailVerifier(String email) {

        try {
            FileInputStream inputFile = new FileInputStream("./file_db/customer");
            Customers.Builder customers = Customers.newBuilder();
            customers.mergeFrom(inputFile);

            int size = customers.getCustomersCount();
            for(int i=0; i<size; i++){
                proto.example.Schema.Customer customer = customers.getCustomers(i);
                if( customer.getEmail().equals(email) ){
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Problem in reading data from file !");
        }

        return false;
    }




    public boolean adminChecker(String email,String Password){   // CHECKING THE VALID ADMIN

        try {
            FileInputStream inputFile = new FileInputStream("./file_db/customer");
            Customers.Builder customers = Customers.newBuilder();
            customers.mergeFrom(inputFile);

            int size = customers.getCustomersCount();
            for(int i=0; i<size; i++){
                proto.example.Schema.Customer customer = customers.getCustomers(i);
                if( email.equals("admin@zoho.com") && customer.getPassword().equals(Password) ){
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Problem in reading data from file !");
        }

        return false;


    }


    public Customers.Builder readFileDataCustomer()
    {
        String usersFilePath = "./file_db/customer";
        Customers.Builder customers = Customers.newBuilder();
        try{
            FileInputStream inputFile = new FileInputStream(usersFilePath);

            customers.mergeFrom(inputFile);
            return  customers;

        } catch (IOException e)
        {
            System.out.println("Problem in reading data from file !");
        }


        return customers;
    }



    public Products.Builder readFileDataProduct()
    {
        String usersFilePath = "./file_db/product";
        Products.Builder products = Products.newBuilder();
        try{
            FileInputStream inputFile = new FileInputStream(usersFilePath);

            products.mergeFrom(inputFile);
            return  products;

        } catch (IOException e)
        {
            System.out.println("Problem in reading data from file !");
        }


        return products;
    }






}
