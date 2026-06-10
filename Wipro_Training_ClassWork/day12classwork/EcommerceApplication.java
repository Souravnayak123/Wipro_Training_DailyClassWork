package com.wipro.day12classwork;

import java.io.*;
import java.util.*;

class Order 
{

    int orderId;
    String productName;
    double price;
    String customerName;
    String address;

    // Constructor
    Order(int orderId, String productName,
          double price, String customerName,
          String address) {

        this.orderId = orderId;
        this.productName = productName;
        this.price = price;
        this.customerName = customerName;
        this.address = address;
    }

    // Save product order
    void saveOrder() 
    {

        try {

            File file = new File("orders.txt");

            if (file.createNewFile()) {

                System.out.println("orders.txt File Created");

            }

            FileWriter fw = new FileWriter(file, true);

            fw.write(orderId + "," +
                     productName + "," +
                     price + "\n");

            fw.close();

            System.out.println("Order Saved");

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Save invoice
    void saveInvoice() 
    {

        try {

            File file = new File("invoice.txt");

            if (file.createNewFile()) {

                System.out.println("invoice.txt File Created");

            }

            FileWriter fw = new FileWriter(file, true);

            fw.write("Invoice ID: " + orderId +
                    " | Product: " + productName +
                    " | Price: " + price + "\n");

            fw.close();

            System.out.println("Invoice Saved");

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Save shipping details
    void saveShippingDetails() 
    {

        try {

            File file = new File("shipping.txt");

            if (file.createNewFile()) {

                System.out.println("shipping.txt File Created");

            }

            FileWriter fw = new FileWriter(file, true);

            fw.write(customerName + "," +
                     address + "\n");

            fw.close();

            System.out.println("Shipping Details Saved");

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Read orders
    static void readOrders() 
    {

        try {

            File file = new File("orders.txt");

            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("\nOrder Details\n");

            while ((line = br.readLine()) != null) {

                System.out.println(line);

            }

            br.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}

public class EcommerceApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Order ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name : ");
        String product = sc.nextLine();

        System.out.print("Enter Product Price : ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Customer Name : ");
        String customer = sc.nextLine();

        System.out.print("Enter Address : ");
        String address = sc.nextLine();

        // Create object
        Order o1 = new Order(
                id,
                product,
                price,
                customer,
                address);

        // Save order
        o1.saveOrder();

        // Save invoice
        o1.saveInvoice();

        // Save shipping details
        o1.saveShippingDetails();

        // Read order details
        Order.readOrders();
    }
}