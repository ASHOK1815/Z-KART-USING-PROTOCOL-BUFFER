package Inventory;

import proto.example.Schema.*;
import filehandler.FileHandler;

/*

INVOICE CLASS CONSIST OF THE SHOWING HISTORY ,SHOWING CART AND SHOWING INVOICE DETAILS

 */
public class Invoice {


    FileHandler fileHandler=new FileHandler();
    public Invoice(Cart.Builder cart,String email, String time, String  date)  // Displaying  the Invoice
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


        int size= cart.getCartItemsCount();
        Products.Builder products = fileHandler.readFileDataProduct();
        for(int i=0;i<size;i++)
        {
            if(cart.getCartItems(i).getEmail().equalsIgnoreCase(email))
            {
                System.out.println("Date:-"+cart.getCartItems(i).getDate());
                int productIndex=0;
                for(int j=0;j<products.getProductsCount();j++){
                    if(products.getProducts(j).getId()==cart.getCartItems(i).getProductId()){
                        productIndex=j;
                        break;
                    }
                }
                System.out.println("Brand:--"+products.getProducts(productIndex).getBrand()+"  "+"Model:--"+products.getProducts(productIndex).getModel()+" "+"Price:--"+cart.getCartItems(i).getPrice());
            }

            System.out.println();
        }
    }



    public Invoice(Orders.Builder  showCart,String email, String time, String date, String s) {



        int size= showCart.getOrdersCount();
        
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
                if(showCart.getOrders(i).getEmail().equalsIgnoreCase(email))
                {
                    Double totalPrice = Double.valueOf(0);
                    System.out.println("------------------------------OrderId-"+showCart.getOrders(i).getId()+"-----------------------------------------");
                    System.out.println("Date:-"+showCart.getOrders(i).getDate());
                    System.out.println("\nProducts:");

                    OrderProducts.Builder orderProducts = fileHandler.readOrderProducts();

                    Products.Builder products= fileHandler.readFileDataProduct();



                    for(int j=0;j<orderProducts.getOrderProductsCount();j++){

                        if(orderProducts.getOrderProducts(j).getOrderId()==showCart.getOrders(i).getId()){
                            totalPrice+=orderProducts.getOrderProducts(j).getPrice();
                            totalPrice=totalPrice-(totalPrice*showCart.getOrders(i).getDiscount()/100.0);

                            int productIndex=0;
                            for(int k=0;k<products.getProductsCount();k++){
                                if(products.getProducts(k).getId()==orderProducts.getOrderProducts(j).getProductId()){
                                    productIndex=k;
                                    break;
                                }
                            }
                            System.out.println("-> Brand:--"+products.getProducts(productIndex).getBrand()+"  "+"Model:--"+products.getProducts(productIndex).getModel()+" "+"Price:--"+products.getProducts(productIndex).getPrice());

                            if(showCart.getOrders(i).getDiscount()==0)
                            {
                                System.out.println("NO COUPEN APPLIED..");
                            }
                            else
                            {
                                System.out.println("\nTOTAL DISCOUNT PERCENTAGE OFFERED BY APPLYING COUPEN:--"+showCart.getOrders(i).getDiscount()+"%");
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
                System.out.println("Brand:--"+product.getProducts(productIndex).getBrand()+"  "+"Model:--"+product.getProducts(productIndex).getModel()+" "+"Price:--"+cartProduct.getCartItems(i).getPrice());
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
