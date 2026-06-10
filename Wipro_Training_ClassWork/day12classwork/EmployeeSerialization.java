package com.wipro.day12classwork;

import java.io.*;
import java.util.*;

// Employee class must implement Serializable
class Employee implements Serializable 
{

    int empId;
    String empName;
    double salary;

    // Constructor
    Employee(int empId, String empName, double salary) 
    {

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Display employee details
    void display() 
    {

        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);

    }
}

public class EmployeeSerialization 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        try {

            // User input
            System.out.print("Enter Employee ID : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Salary : ");
            double salary = sc.nextDouble();

            // Create employee object
            Employee e1 = new Employee(id, name, salary);

            // Serialization
            File file = new File("employee.txt");

            if (file.createNewFile()) {

                System.out.println("employee.txt File Created");

            }

            FileOutputStream fos =
                    new FileOutputStream(file);

            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);

            // Save object into file
            oos.writeObject(e1);

            oos.close();

            System.out.println("Employee Object Saved");

            // Deserialization
            FileInputStream fis =
                    new FileInputStream(file);

            ObjectInputStream ois =
                    new ObjectInputStream(fis);

            // Retrieve object from file
            Employee emp =
                    (Employee) ois.readObject();

            System.out.println("\nRetrieved Employee Details\n");

            emp.display();

            ois.close();

        } catch (Exception e) 
        {

            System.out.println(e);

        }
    }
}