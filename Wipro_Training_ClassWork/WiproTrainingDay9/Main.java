package WiproTrainingDay9;

import java.util.*;

//Patient class
class Patient {
 String name;

 Patient(String name) {
     this.name = name;
 }

 public String toString() {
     return name;
 }
}

//Management class
class PatientManagementSystem {

 ArrayList<Patient> patients = new ArrayList<>();

 void addPatient(String name) {
     patients.add(new Patient(name));
     System.out.println("Patient added.");
 }

 void viewPatients() {
     if (patients.isEmpty()) {
         System.out.println("No patients available.");
     } else {
         System.out.println("Patient List:");
         for (Patient p : patients) {
             System.out.println(p);
         }
     }
 }

 void searchPatient(String name) {
     boolean found=false;

     for (Patient p : patients) {
         if (p.name.equalsIgnoreCase(name)) {
             System.out.println("Patient Found: " + p);
             found = true;
             break;
         }
     }

     if (found==false) {
         System.out.println("Patient not found.");
     }
 }
}

//Main class
public class Main {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     PatientManagementSystem pms = new PatientManagementSystem();

     int ch = 0;

     while (ch != 4) {

         System.out.println("\n1. Add Patient");
         System.out.println("2. View Patients");
         System.out.println("3. Search Patient");
         System.out.println("4. Exit");	

         System.out.print("Enter choice: ");
         ch = sc.nextInt();
         sc.nextLine();

         if (ch == 1) {
             System.out.print("Enter name: ");
             String name = sc.nextLine();
             pms.addPatient(name);
         }

         else if (ch == 2) {
             pms.viewPatients();
         }

         else if (ch == 3) {
             System.out.print("Enter name to search: ");
             String name = sc.nextLine();
             pms.searchPatient(name);
         }

         else if (ch == 4) {
             System.out.println("Exiting...");
         }

         else {
             System.out.println("Invalid choice");
         }
     }

     sc.close();
 }
}