package com.zcart;

import filehandler.FileHandler;
import proto.example.Schema.Customers;
import proto.example.Schema.Product;
import proto.example.Schema.Products;

import java.io.*;
import java.util.Scanner;

public class DataHandler {

    public void showCustomerData(){
        try {
            FileInputStream inputFile = new FileInputStream("./file_db/customer");
            Customers.Builder customers = Customers.newBuilder();
            customers.mergeFrom(inputFile);

            int size = customers.getCustomersCount();
            for(int i=0; i<size; i++){
                System.out.println("Email "+customers.getCustomers(i).getEmail());
                System.out.println("Password "+customers.getCustomers(i).getEmail());
                System.out.println("Name "+customers.getCustomers(i).getEmail());
                System.out.println("Mpbile_Number "+customers.getCustomers(i).getEmail());
                System.out.println("Coupen_Generated"+customers.getCustomers(i).getEmail());
            }
        } catch (IOException e) {
            System.out.println("Problem in reading data from file !");
        }
    }


    public void showProductData()
    {

        try {
            FileInputStream inputFile = new FileInputStream("./file_db/product");
            Products.Builder products = Products.newBuilder();
            products.mergeFrom(inputFile);

            int size = products.getProductsCount();
            for(int i=0; i<size; i++){
                System.out.println("ID "+products.getProducts(i).getId());
                System.out.println("Category "+products.getProducts(i).getCategory());
                System.out.println("Brand "+products.getProducts(i).getBrand());
                System.out.println("Model "+products.getProducts(i).getModel());
                System.out.println("Price "+products.getProducts(i).getPrice());
                System.out.println("Stock "+products.getProducts(i).getStock());

            }
        } catch (IOException e) {
            System.out.println("Problem in reading data from file !");
        }



    }


    void addProduct()
    {
        Scanner scan = new Scanner(System.in);

        String usersFilePath = "./file_db/product";

        Product.Builder products= Product.newBuilder();
        FileHandler fileioworker = new FileHandler();
        for(int i=1;i<=4;i++)
        {
            int id=i;
            System.out.println("Enter the category ");
            String category= scan.next();
            System.out.println("Enter the Brand ");
            String brand= scan.next();
            System.out.println("Enter the model ");
            String model= scan.next();
            System.out.println("Enter the price ");
            int price=scan.nextInt();
            System.out.println("Enter the stock ");
            int stock= scan.nextInt();
            products.setId(id);
            products.setStock(stock);
            products.setBrand(brand);
            products.setPrice(price);
            products.setModel(model);
            products.setCategory(category);
            fileioworker.addProduct(products,usersFilePath);


        }


    }



}
