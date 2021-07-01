package Inventory;

import proto.example.Schema.*;
import filehandler.FileHandler;

public class Invoice {


    FileHandler fileHandler=new FileHandler();
    public Invoice(String email, String time, String  date)  // Displaying  the Invoice
    {

        System.out.println("------------------------------Z-KART-----------------------------------------");
        System.out.println("----------------------Everything at one place--------------------------------");
        System.out.println();
        System.out.println("               TAX Invoice/Bill of Supply/Cash Memo                            ");
        System.out.println();
        System.out.println("USER-EMAIL "+email);
        System.out.println("DATE:- "+date);
        System.out.println("Time:- "+time);
        int invoiceNumber = (int)Math.floor(Math.random()*(9999-1000+1)+1000);
        System.out.println("Invoice Number "+invoiceNumber);
        System.out.println();

        Cart.Builder  product= fileHandler.readCartItems();
        int size= product.getCartItemsCount();

//        for(int i=0;i<size;i++)
//        {
//            if(product.getCartItems(i).getEmail().equalsIgnoreCase(email))
//            {
//
//                System.out.println("Date:-"+product.getCartItems(i).getDate());
//                int productIndex=0;
//                for(int j=0;j<products.size();j++){
//                    if(products.get(j).id==listProduct.get(i).productId){
//                        productIndex=j;
//                        break;
//                    }
//                }
//                System.out.println("Brand:--"+products.get(productIndex).brand+"  "+"Model:--"+products.get(productIndex).model+" "+"Price:--"+listProduct.get(i).price);
//            }
//
//            System.out.println();
        //}




    }



    public Invoice(String email, String time, String date, String s) {


        Orders.Builder listHistoryCart=fileHandler.readHistoryProductUser();
        int size= listHistoryCart.getOrdersCount();
        
        if(size==0)
        {
            System.out.println("----------------------NO-PRODUCT HISTORY YET---------------------------------");
            System.out.println();
        }
        else
        {
            System.out.println("------------------------------Z-KART-----------------------------------------");
            System.out.println("----------------------Everything at one place--------------------------------");
            System.out.println();
            System.out.println("USER-EMAIL "+email);
            System.out.println();

          
            for(int i=0;i<size;i++)
            {
                if(listHistoryCart.getOrders(i).getEmail().equalsIgnoreCase(email))
                {
                    Double totalPrice = Double.valueOf(0);
                    System.out.println("------------------------------OrderId-"+listHistoryCart.getOrders(i).getId()+"-----------------------------------------");
                    System.out.println("Date:-"+listHistoryCart.getOrders(i).getDate());
                    System.out.println("\nProducts:");

                    OrderProducts.Builder orderProducts = fileHandler.readOrderProducts();

                    Products.Builder products= fileHandler.readFileDataProduct();



                    for(int j=0;j<orderProducts.getOrderProductsCount();j++){

                        if(orderProducts.getOrderProducts(j).getOrderId()==listHistoryCart.getOrders(i).getId()){
                            totalPrice+=orderProducts.getOrderProducts(j).getPrice();
                            totalPrice=totalPrice-(totalPrice*listHistoryCart.getOrders(i).getDiscount()/100.0);

                            int productIndex=0;
                            for(int k=0;k<products.getProductsCount();k++){
                                if(products.getProducts(k).getId()==orderProducts.getOrderProducts(j).getProductId()){
                                    productIndex=k;
                                    break;
                                }
                            }
                            System.out.println("-> Brand:--"+products.getProducts(productIndex).getBrand()+"  "+"Model:--"+products.getProducts(productIndex).getModel()+" "+"Price:--"+products.getProducts(productIndex).getPrice());

                            if(listHistoryCart.getOrders(i).getDiscount()==0)
                            {
                                System.out.println("NO COUPEN APPLIED..");
                            }
                            else
                            {
                                System.out.println("\nTOTAL DISCOUNT PERCENTAGE OFFERED BY APPLYING COUPEN:--"+listHistoryCart.getOrders(i).getDiscount()+"%");
                            }

                        }
                    }

                    System.out.println("\nTOTAL PAY AMOUNT FOR THIS ORDER:--"+totalPrice+"  Rs only");
                    System.out.println("--------------------------------------------------------------------");
                }
                System.out.println();
            }


            System.out.println("----------------------Z-KART-----------------------------------");
            System.out.println();
        }



    }




    public Invoice(String email, String time, String date, double number)     // Displaying  the cart details
    {

        Cart.Builder  cartProduct= fileHandler.readCartItems();
        int size= cartProduct.getCartItemsCount();

        Products.Builder product=fileHandler.readFileDataProduct();
        int sizeProduct= product.getProductsCount();



        System.out.println("------------------------------Z-KART-----------------------------------------");
        System.out.println("----------------------Everything at one place--------------------------------");
        System.out.println();
        System.out.println("               PRODUCT AVAILABLE IN YOUR ORDER CART                           ");
        System.out.println();
        System.out.println("USER-EMAIL "+email);
        System.out.println("DATE:- "+date);
        System.out.println("Time:- "+time);
        System.out.println();

        boolean flag=true;
        for(int i=0;i<size;i++)
        {
            if(cartProduct.getCartItems(i).getEmail().equalsIgnoreCase(email))
            {
                flag=false;
                System.out.println("Date:-"+cartProduct.getCartItems(i).getDate());
                int productIndex=0;
                for(int j=0;j<sizeProduct;j++){
                    if(product.getProducts(j).getId()==cartProduct.getCartItems(i).getProductId()){
                        productIndex=j;
                        break;
                    }
                }
                System.out.println("Brand:--"+product.getProducts(productIndex).getBrand()+"  "+"Model:--"+product.getProducts(productIndex).getModel()+" "+"Price:--"+product.getProducts(productIndex).getPrice());
            }

            System.out.println();
        }



        if(flag)
        {
            System.out.println();
            System.out.println("------------------YOUR CART IS EMPTY------------------------------------");
            System.out.println();

        }


        System.out.println("----------------------Z-KART-----------------------------------");
        System.out.println();



    }










}
