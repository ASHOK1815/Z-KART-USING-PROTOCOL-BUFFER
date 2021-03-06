package filehandler;

import proto.example.Schema.*;

import java.io.*;
import java.util.ArrayList;

/*
    FileHandler deals with all the file reading and writing section,
    1.addUser method used to add customer to file.
    2.addCart method used to add contains in cart file.
    3.addProduct method used to add products to the  file.


 */

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


    public void addCart(proto.example.Schema.CartItem.Builder cart, String filePath) {

        try{
            FileInputStream inputFile = new FileInputStream(filePath);
            Cart.Builder carts= Cart.newBuilder();
            carts.mergeFrom(inputFile);
            carts.addCartItems(cart);

            FileOutputStream outputFile = new FileOutputStream(filePath);
            carts.build().writeTo(outputFile);
        } catch (IOException e)
        {
            System.out.println("Problem in adding data to cart  file !");
        }
    }


    public void addProduct(proto.example.Schema.Product.Builder Product, String filePath) {

        try{
            FileInputStream inputFile = new FileInputStream(filePath);
            Products.Builder products=Products.newBuilder();
            products.mergeFrom(inputFile);
            products.addProducts(Product);

            FileOutputStream outputFile = new FileOutputStream(filePath);
            products.build().writeTo(outputFile);
        } catch (IOException e)
        {
            System.out.println("Problem in adding data from file !");
        }
    }

    public void addOrderProduct(proto.example.Schema.OrderProduct.Builder order, String filePath) {

        try{
            FileInputStream inputFile = new FileInputStream(filePath);
            OrderProducts.Builder orders=OrderProducts.newBuilder();
            orders.mergeFrom(inputFile);
            orders.addOrderProducts(order);

            FileOutputStream outputFile = new FileOutputStream(filePath);
            orders.build().writeTo(outputFile);
        } catch (IOException e)
        {
            System.out.println("Problem in adding data from file !");
        }
    }



    public void addCoupon(proto.example.Schema.Coupon.Builder coupen, String filePath) {

        try{
            FileInputStream inputFile = new FileInputStream(filePath);
            Coupons.Builder coupons= Coupons.newBuilder();
            coupons.mergeFrom(inputFile);
            coupons.addCoupons(coupen);

            FileOutputStream outputFile = new FileOutputStream(filePath);
            coupen.build().writeTo(outputFile);
        } catch (IOException e)
        {
            System.out.println("Problem in adding data from file !");
        }
    }


    public void addOrder(proto.example.Schema.Order.Builder order, String filePath) {

        try{
            FileInputStream inputFile = new FileInputStream(filePath);
            Orders.Builder orders=Orders.newBuilder();
            orders.mergeFrom(inputFile);
            orders.addOrders(order);

            FileOutputStream outputFile = new FileOutputStream(filePath);
            orders.build().writeTo(outputFile);
        } catch (IOException e)
        {
            System.out.println("Problem in adding data from file !");
        }
    }


    public void addLastId(proto.example.Schema.IdTracker.Builder idtracker, String filePath) {

        try{
            FileInputStream inputFile = new FileInputStream(filePath);
            IdTrackers.Builder idtrackers=IdTrackers.newBuilder();
            idtrackers.mergeFrom(inputFile);
            idtrackers.addIdTrackers(idtracker);

            FileOutputStream outputFile = new FileOutputStream(filePath);
            idtrackers.build().writeTo(outputFile);
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


    public Coupons.Builder readCoupen()
    {
        String usersFilePath = "./file_db/coupen";
        Coupons.Builder coupens=Coupons.newBuilder();
        try{
            FileInputStream inputFile = new FileInputStream(usersFilePath);

            coupens.mergeFrom(inputFile);
            return  coupens;

        } catch (IOException e)
        {
            System.out.println("Problem in reading data from file !");
        }
        return coupens;

    }


    public Customers.Builder readOldPassword()
    {
        String usersFilePath = "./file_db/password";
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


    public Cart.Builder readCartItems()
    {
        String usersFilePath = "./file_db/cart";
        Cart.Builder cart = Cart.newBuilder();
        try{
            FileInputStream inputFile = new FileInputStream(usersFilePath);

            cart.mergeFrom(inputFile);
            return  cart;

        } catch (IOException e)
        {
            System.out.println("Problem in reading data from file !");
        }


        return cart;
    }


    public IdTrackers.Builder readLastId()
    {
        String usersFilePath = "./file_db/idtracker";

        IdTrackers.Builder id=IdTrackers.newBuilder();
        try{
            FileInputStream inputFile = new FileInputStream(usersFilePath);

            id.mergeFrom(inputFile);
            return  id;

        } catch (IOException e)
        {
            System.out.println("Problem in reading data from file !");
        }


        return id;
    }
    public Orders.Builder readHistoryProductUser()
    {
        String usersFilePath = "./file_db/order";

        Orders.Builder order=Orders.newBuilder();
        try{
            FileInputStream inputFile = new FileInputStream(usersFilePath);

            order.mergeFrom(inputFile);
            return  order;

        } catch (IOException e)
        {
            System.out.println("Problem in reading data from file !");
        }


        return order;

    }



    public OrderProducts.Builder readOrderProducts()
    {
        String usersFilePath = "./file_db/order_product";

        OrderProducts.Builder order=OrderProducts.newBuilder();
        try{
            FileInputStream inputFile = new FileInputStream(usersFilePath);

            order.mergeFrom(inputFile);
            return  order;

        } catch (IOException e)
        {
            System.out.println("Problem in reading data from file !");
        }


        return order;

    }



    public boolean emailAndPasswordVerifier(String email,String password) { // Email and password verifier

        try {
            FileInputStream inputFile = new FileInputStream("./file_db/customer");
            Customers.Builder customers = Customers.newBuilder();
            customers.mergeFrom(inputFile);

            int size = customers.getCustomersCount();
            for(int i=0; i<size; i++){
                proto.example.Schema.Customer customer = customers.getCustomers(i);
                if( email.equals(customer.getEmail()) && password.equals(customer.getPassword()) ){
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Problem in reading data from file !");
        }

        return false;

    }


    public void fileDataVanisher(File file)  // REMOVING DATA FROM THE FILE
    {
        FileWriter fwOb = null;
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();

        } catch (IOException e) {
            System.out.println("Problem in removing data from file !");
        }

    }






}
