package com.zcart;

import filehandler.FileHandler;
import proto.example.Schema.*;

import java.io.*;
import java.util.Scanner;

public class DataHandler {

    Scanner scan = new Scanner(System.in);
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


    public void showCartData()
    {

        try {
            FileInputStream inputFile = new FileInputStream("./file_db/cart");
            Cart.Builder carts = Cart.newBuilder();
            carts.mergeFrom(inputFile);

            int size = carts.getCartItemsCount();
            for(int i=0; i<size; i++){
                System.out.println("Email "+carts.getCartItems(i).getEmail());
                System.out.println("Product ID "+carts.getCartItems(i).getProductId());
                System.out.println("Price "+carts.getCartItems(i).getPrice());
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Problem in reading Cart data from file !");
        }
    }


    void addProduct()
    {


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

    void addIds()
    {
        String idFilePath = "./file_db/idtracker";

        IdTracker.Builder id=IdTracker.newBuilder();
        FileHandler fileioworker = new FileHandler();

        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the name ");
            String name= scan.next();
            System.out.println("Enter the id ");
            int value= scan.nextInt();
            id.setName(name);
            id.setLastId(value);


            fileioworker.addLastId(id,idFilePath);

        }
    }


    void showIdTracker()
    {
        try {
            FileInputStream inputFile = new FileInputStream("./file_db/idtracker");
            IdTrackers.Builder ids=IdTrackers.newBuilder();

            ids.mergeFrom(inputFile);

            int size = ids.getIdTrackersCount();
            for(int i=0; i<size; i++){
                System.out.println("Name "+ids.getIdTrackers(i).getName());
                System.out.println("Last_id "+ids.getIdTrackers(i).getLastId());

                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Problem in reading Cart data from file !");
        }


    }



}
