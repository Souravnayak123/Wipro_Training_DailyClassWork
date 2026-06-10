package com.wipro.day12classwork;

import java.io.*;
import java.util.*;

class FoodOrder {

    int orderId;
    String restaurantName;
    String foodItem;
    double price;
    String customerName;
    String deliveryAddress;

    // Constructor
    FoodOrder(int orderId,
              String restaurantName,
              String foodItem,
              double price,
              String customerName,
              String deliveryAddress) {

        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.foodItem = foodItem;
        this.price = price;
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
    }

    // Store restaurant menu
    void saveMenu() {

        try {

            File file = new File("menu.txt");

            if (file.createNewFile()) {

                System.out.println("menu.txt File Created");

            }

            FileWriter fw = new FileWriter(file, true);

            fw.write(restaurantName + "," +
                     foodItem + "," +
                     price + "\n");

            fw.close();

            System.out.println("Menu Saved");

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Store customer order
    void saveOrder() {

        try {

            File file = new File("orders.txt");

            if (file.createNewFile()) {

                System.out.println("orders.txt File Created");

            }

            FileWriter fw = new FileWriter(file, true);

            fw.write("Order ID: " + orderId +
                    " | Customer: " + customerName +
                    " | Food Item: " + foodItem +
                    " | Price: " + price + "\n");

            fw.close();

            System.out.println("Order Saved");

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Store delivery log
    void saveDeliveryLog() {

        try {

            File file = new File("delivery_logs.txt");

            if (file.createNewFile()) {

                System.out.println("delivery_logs.txt File Created");

            }

            FileWriter fw = new FileWriter(file, true);

            fw.write("Order ID: " + orderId +
                    " | Delivered To: " + customerName +
                    " | Address: " + deliveryAddress + "\n");

            fw.close();

            System.out.println("Delivery Log Saved");

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Read customer orders
    static void readOrders() {

        try {

            File file = new File("orders.txt");

            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("\nCustomer Orders\n");

            while ((line = br.readLine()) != null) {

                System.out.println(line);

            }

            br.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}

public class FoodDeliveryApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Order ID : ");
        int orderId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Restaurant Name : ");
        String restaurant = sc.nextLine();

        System.out.print("Enter Food Item : ");
        String food = sc.nextLine();

        System.out.print("Enter Price : ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Customer Name : ");
        String customer = sc.nextLine();

        System.out.print("Enter Delivery Address : ");
        String address = sc.nextLine();

        // Create object
        FoodOrder f1 = new FoodOrder(
                orderId,
                restaurant,
                food,
                price,
                customer,
                address);

        // Save menu
        f1.saveMenu();

        // Save order
        f1.saveOrder();

        // Save delivery log
        f1.saveDeliveryLog();

        // Read orders
        FoodOrder.readOrders();
    }
}