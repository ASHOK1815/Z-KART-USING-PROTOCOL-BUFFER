package product;

import filehandler.FileHandler;
import proto.example.Schema.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Shopping {

    FileHandler fileHandler=new FileHandler();
    Scanner scan=new Scanner(System.in);

    LocalTime timeObj = LocalTime.now();
    LocalDate dateObj = LocalDate.now();
    public void displayUserPrefrenceProduct(String category)
    {

        Products.Builder products=fileHandler.readFileDataProduct();
        int size=products.getProductsCount();

        for(int i=0;i<size;i++)
        {
            if(products.getProducts(i).getCategory().equalsIgnoreCase(category))
            {

                System.out.println("BRAND :-" +products.getProducts(i).getBrand());
                System.out.println("MODEL :-" +products.getProducts(i).getModel());
                System.out.println("PRICE :-" +products.getProducts(i).getPrice());


            }


        }


    }

    public int highestStock()
    {
        Products.Builder products=fileHandler.readFileDataProduct();
        int size=products.getProductsCount();
        int value = 0;
        for(int i=0;i<size;i++)
        {
            if(products.getProducts(i).getStock()>value)
            {
                value=products.getProducts(i).getStock();
            }

        }

        return value;

    }

    public void productPurchase_Customer(String category,String email)
    {
        double price=0;
        System.out.println("Enter the brand and model you want to buy");
        String brandName = scan.next();
        String modelName  = scan.next();


        int highestStockNumber=highestStock();
        int productId=0;
        boolean flag=false;

        Products.Builder products=fileHandler.readFileDataProduct();
        int size=products.getProductsCount();

        if(highestStockNumber!=0)
        {
            for(int i=0;i<size;i++)
            {
                if(brandName.equalsIgnoreCase(products.getProducts(i).getBrand())  &&  modelName.equalsIgnoreCase(products.getProducts(i).getModel()))
                {
                    price=products.getProducts(i).getPrice();
                    productId=products.getProducts(i).getId();
                    if(products.getProducts(i).getStock()==highestStockNumber)
                    {
                        flag=true;
                        break;
                    }
                }
            }

        }

        if(price==0 && productId==0)
        {
            System.out.println("Invalid Input..");
            return;
        }




        String userFilePath = "./file_db/cart";
        CartItem.Builder cart=proto.example.Schema.CartItem.newBuilder();

        if(flag)
        {
            price=price-(price/10.0);
            cart.setEmail(email);
            cart.setProductId(productId);
            cart.setPrice(price);
            cart.setTime(timeObj.toString());
            cart.setDate(dateObj.toString());

            try {
                FileOutputStream outputFile= new FileOutputStream(userFilePath);
                products.build().writeTo(outputFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            cart.setEmail(email);
            cart.setProductId(productId);
            cart.setPrice(price);
            cart.setTime(timeObj.toString());
            cart.setDate(dateObj.toString());

            try {
                FileOutputStream outputFile= new FileOutputStream(userFilePath);
                products.build().writeTo(outputFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Product added successfully to Cart");

        return;
    }


    void checkOutUpdate(String email) // checkout the data from the cart and updating coupen
    {
        String cartFilePath = "./file_db/cart";

        Cart.Builder cart=fileHandler.readCartItems();
        IdTrackers.Builder idTracker=fileHandler.readLastId();

        int size=idTracker.getIdTrackersCount(); // tasking
        int newOrderId = 0;
        int discountOffer=0;

        for(int i=0;i<size;i++){
            if(idTracker.getIdTrackers(i).getName().equals("order")){
                newOrderId=idTracker.getIdTrackers(i).getLastId()+1;
                IdTracker.Builder id=IdTracker.newBuilder();
                id.mergeFrom(idTracker.getIdTrackers(i));
                id.setLastId(newOrderId);
                idTracker.setIdTrackers(i,id);
                try {
                    FileOutputStream outputFile= new FileOutputStream(cartFilePath);
                    idTracker.build().writeTo(outputFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

        int increment=0;
        size=cart.getCartItemsCount();
        for(int i=0;i<size;i++)
        {
            if(cart.getCartItems(i).getEmail().equals(email))
            {
                increment++;
            }
        }

        if(increment==0)
        {
            System.out.println("------PLEASE ADD SOME PRODUCT IN CART--------");
            return;
        }

// Update Product Stocks

        Products.Builder  productList=fileHandler.readFileDataProduct();

        Set<Integer> cartIteamsOutOfStock= new HashSet<Integer>();

        int is_stock_avialable = 1;
        String outOfStockMsg = "";
        size= productList.getProductsCount();

        for(int i=0;i<size;i++)
        {
            for(int j=0;j< cart.getCartItemsCount();j++)
            {
                if( cart.getCartItems(j).getEmail().equals(email) && productList.getProducts(i).getId()==cart.getCartItems(j).getProductId())
                {
                    if(productList.getProducts(i).getStock()>=1){

                        Product.Builder product=Product.newBuilder();
                        product.mergeFrom(productList.getProducts(i));
                        product.setStock(productList.getProducts(i).getStock()-1);
                        productList.setProducts(i,product);

                        String productFile = "./file_db/product";

                        try {
                            FileOutputStream outputFile= new FileOutputStream(productFile);
                            productList.build().writeTo(outputFile);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }else{
                        cartIteamsOutOfStock.add(j);
                        outOfStockMsg += String.format("------%s %s NOT AVAILABLE IN STOCK--------\n",productList.getProducts(i).getBrand(),productList.getProducts(i).getModel());
                        is_stock_avialable=0;
                    }
                }
            }
        }


        if(is_stock_avialable==0){
            System.out.println(String.format("------!!CHECKOUT ABORT!!--------"));
            System.out.println(outOfStockMsg);
            System.out.println(String.format("------THESE OUT OF STOCK PRODUCTS WILL BE REMOVED FROM YOUR CART--------"));
            FileHandler fileHandler =new FileHandler();
            fileHandler.fileDataVanisher(new File(cartFilePath));

            for(int i=0;i<cart.getCartItemsCount();i++){
                if(!cartIteamsOutOfStock.contains(i)){
                    fileHandler.addCart(cart.getCartItems(i).toBuilder(),cartFilePath);
                }
            }
            return;
        }



    }




    public void shoppingDetials(String email)
    {
        char Choice;
        do
        {
            System.out.println("------Welcome to Z-kart---------");
            System.out.println("1:Shopping");
            System.out.println("2:ORDER-HISTORY");
            System.out.println("3:CHECK-OUT");
            System.out.println("4:SHOW-CART");
            System.out.println("5:Empty Cart");
            System.out.println("6:Log-Out");
            Choice = scan.next().charAt(0);
            int counter=0;
            switch (Choice)
            {
                case '1':

                    System.out.println("Enter the category you want to see");
                    System.out.println("Type:1-MOBILE");
                    System.out.println("Type:2-LAPTOP");
                    System.out.println("Type:3-TABLET");
                    int category;

                    try {
                        category=scan.nextInt();

                    } catch (InputMismatchException e) {
                        System.out.print("Caution:-- Please enter number between 1-3\n");
                        scan.next();

                        break;
                    }
                    String addCategory = null;


                    if(category==1)
                    {
                        System.out.println("CATEGORY:---MOBILE----------- ");
                        addCategory="Mobile";
                        displayUserPrefrenceProduct(addCategory);

                    }
                    else if(category==2)
                    {
                        System.out.println("CATEGORY:---LAPTOP----------- ");
                        addCategory="Laptop";
                        displayUserPrefrenceProduct(addCategory);
                    }
                    else if(category==3)
                    {
                        System.out.println("CATEGORY:---Tablet----------- ");
                        addCategory="Tablet";
                        displayUserPrefrenceProduct(addCategory);
                    }

                    System.out.println("Do you want to buy Something:-PRESS:-1      PRESS:-2 QUIT");


                    try {

                        category=scan.nextInt();

                    } catch (InputMismatchException e) {
                        System.out.print("Caution:-- Please enter number between 1-2\n");
                        scan.next();

                        break;
                    }

                    if(category==1)
                    {
                        productPurchase_Customer(addCategory,email);
                    }
                    else
                    {
                        System.out.println("------Thanks for visiting Z-KART--------");
                    }
                    break;


                case '2':

//                    Orders.Builder listHistoryCart=fileHandler.readHistoryProductUser();
//                    int size= listHistoryCart.getOrdersCount();
//
//                    for(int i=0;i<size;i++)
//                    {
//                        if(listHistoryCart.getOrders(i).getEmail().equals(email))
//                        {
//                            showCart.add(listHistoryCart.get(i));
//                        }
//                    }
//
//                    Invoice invoiceObject=new Invoice(showCart,email,timeObj.toString(),dateObj.toString(),"0");
//                    break;

                case '3':

                    checkOutUpdate(email);
                    break;

                case '4':
//                    ArrayList<Cart> listCart =filehandler.readCurrentProductUser();
//                    ArrayList<Cart> showCartProduct=new ArrayList<Cart>();
//
//                    for(int i=0;i<listCart.size();i++)
//                    {
//                        if(listCart.get(i).email.equals(email))
//                        {
//                            showCartProduct.add(listCart.get(i));
//                        }
//                    }
//
//
//                    Invoice invoiceObj=new Invoice(showCartProduct,email,timeObj.toString(),dateObj.toString(),0.0);
//                    break;

                case '5':
//                    ArrayList<Cart> productsInCart =filehandler.readCurrentProductUser();
//                    File cartFile= new File("./File_db/z-current-product_db.txt");
//                    filehandler.fileDataVanisher(cartFile);
//                    int flag=0;
//                    for(int i=0;i<productsInCart.size();i++){
//                        if(!productsInCart.get(i).email.equals(email)){
//                            filehandler.addCart(productsInCart.get(i), cartFile);
//                        }else{
//                            flag=1;
//                        }
//                    }
//                    if(flag==1){
//                        System.out.println("------YOUR CART HAS BEEN EMPTIED SUCCESSFULLY--------\n");
//                    }else{
//                        System.out.println("------YOUR CART IS ALREADY EMPTY--------\n");
//                    }

                default:
                    break;


            }

        } while (Choice !='6');





    }




}






