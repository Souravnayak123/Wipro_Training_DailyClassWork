package com.wipro.day12classwork;

import java.io.*;
import java.util.*;

class BankAccount {

    int accountNumber;
    String customerName;
    double balance;

    // Constructor
    BankAccount(int accountNumber,
                String customerName,
                double balance) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Save account details
    void saveAccount() {

        try {

            File file = new File("accounts.txt");

            if (file.createNewFile()) {

                System.out.println("accounts.txt File Created");

            }

            FileWriter fw = new FileWriter(file, true);

            fw.write(accountNumber + "," +
                     customerName + "," +
                     balance + "\n");

            fw.close();

            System.out.println("Account Details Saved");

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Store transaction history
    void transaction(String type, double amount) {

        try {

            File file = new File("transactions.txt");

            if (file.createNewFile()) {

                System.out.println("transactions.txt File Created");

            }

            FileWriter fw = new FileWriter(file, true);

            fw.write("Account No: " + accountNumber +
                    " | " + type +
                    " | Amount: " + amount + "\n");

            fw.close();

            System.out.println("Transaction Saved");

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Read account details
    static void readAccounts() {

        try {

            File file = new File("accounts.txt");

            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("\nCustomer Account Details\n");

            while ((line = br.readLine()) != null) {

                String data[] = line.split(",");

                System.out.println("Account Number : " + data[0]);
                System.out.println("Customer Name  : " + data[1]);
                System.out.println("Balance        : " + data[2]);

                System.out.println("----------------------------");
            }

            br.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}

public class BankingApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Account Number : ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Balance : ");
        double balance = sc.nextDouble();
        sc.nextLine();

        // Create account object
        BankAccount b1 =
                new BankAccount(accNo, name, balance);

        // Save account details
        b1.saveAccount();

        // Transaction input
        System.out.print("Enter Transaction Type : ");
        String type = sc.nextLine();

        System.out.print("Enter Amount : ");
        double amount = sc.nextDouble();

        // Save transaction
        b1.transaction(type, amount);

        // Read account details
        BankAccount.readAccounts();
    }
}