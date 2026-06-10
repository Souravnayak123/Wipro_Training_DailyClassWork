package com.wipro.day10classwork;

import java.util.*;

class Patient 
{
 int id;
 String name;
 int age;

 Patient(int id, String name, int age) 
 {
     this.id = id;
     this.name = name;
     this.age = age;
 }

 public String toString() 
 {
     return "ID: " + id + ", Name: " + name + ", Age: " + age;
 }
}


public class HospitalSystem 
{
 public static void main(String[] args) 
 {

     HashMap<Integer, Patient> map = new HashMap<>();
     Scanner sc = new Scanner(System.in);
     int choice;

     do {
         System.out.println("\n1. Add Patient");
         System.out.println("2. Update Patient");
         System.out.println("3. View Patient");
         System.out.println("4. Remove Patient");
         System.out.println("5. List All Patients");
         System.out.println("6. Check Patient Exists");
         System.out.println("7. Count Patients");
         System.out.println("8. Clear System");
         System.out.println("9. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();

         switch (choice) 
         {

             case 1: // Add
                 System.out.print("Enter ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();

                 if (map.containsKey(id)) 
                 {
                     System.out.println("Patient already exists!");
                     break;
                 }

                 System.out.print("Enter Name: ");
                 String name = sc.nextLine();

                 System.out.print("Enter Age: ");
                 int age = sc.nextInt();

                 map.put(id, new Patient(id, name, age));
                 System.out.println("Patient added successfully!");
                 break;

             case 2: // Update
                 System.out.print("Enter ID to update: ");
                 id = sc.nextInt();
                 sc.nextLine();

                 if (map.containsKey(id)) 
                 {
                     System.out.print("Enter New Name: ");
                     name = sc.nextLine();

                     System.out.print("Enter New Age: ");
                     age = sc.nextInt();

                     map.put(id, new Patient(id, name, age));
                     System.out.println("Patient updated!");
                 } 
                 else 
                 {
                     System.out.println("Patient not found!");
                 }
                 break;

             case 3: // Retrieve
                 System.out.print("Enter ID: ");
                 id = sc.nextInt();

                 if (map.containsKey(id)) 
                 {
                     System.out.println(map.get(id));
                 } else 
                 {
                     System.out.println("Patient not found!");
                 }
                 break;

             case 4: // Remove
                 System.out.print("Enter ID: ");
                 id = sc.nextInt();

                 if (map.remove(id) != null) 
                 {
                     System.out.println("Patient removed!");
                 } else 
                 {
                     System.out.println("Patient not found!");
                 }
                 break;

             case 5: // List all
                 if (map.isEmpty()) 
                 {
                     System.out.println("No patients found!");
                 } else 
                 {
                     for (Patient p : map.values()) 
                     {
                         System.out.println(p);
                     }
                 }
                 break;

             case 6: // Check existence
                 System.out.print("Enter ID: ");
                 id = sc.nextInt();

                 if (map.containsKey(id)) 
                 {
                     System.out.println("Patient exists");
                 } else 
                 {
                     System.out.println("Patient does not exist");
                 }
                 break;

             case 7: // Count
                 System.out.println("Total Patients: " + map.size());
                 break;

             case 8: // Clear
                 map.clear();
                 System.out.println("All records cleared!");
                 break;

             case 9:
                 System.out.println("Exiting...");
                 break;

             default:
                 System.out.println("Invalid choice!");
         }

     } while (choice != 9);

     sc.close();
 }
}