package com.wipro.day12classwork;

import java.io.*;
import java.util.*;

class Patient {

    int patientId;
    String patientName;
    String disease;
    String doctorName;

    // Constructor
    Patient(int patientId, String patientName,
            String disease, String doctorName) {

        this.patientId = patientId;
        this.patientName = patientName;
        this.disease = disease;
        this.doctorName = doctorName;
    }

    // Store patient records
    void savePatientRecord() {

        try {

            File file = new File("patients.txt");

            if (file.createNewFile()) {

                System.out.println("patients.txt File Created");

            }

            FileWriter fw = new FileWriter(file, true);

            fw.write(patientId + "," +
                     patientName + "," +
                     disease + "," +
                     doctorName + "\n");

            fw.close();

            System.out.println("Patient Record Saved");

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // Read patient records
    static void readPatientRecords() {

        try {

            File file = new File("patients.txt");

            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("\nPatient Records\n");

            while ((line = br.readLine()) != null) {

                String data[] = line.split(",");

                System.out.println("Patient ID   : " + data[0]);
                System.out.println("Patient Name : " + data[1]);
                System.out.println("Disease      : " + data[2]);
                System.out.println("Doctor Name  : " + data[3]);

                System.out.println("---------------------------");
            }

            br.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}

public class HospitalManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Patient ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Disease : ");
        String disease = sc.nextLine();

        System.out.print("Enter Doctor Name : ");
        String doctor = sc.nextLine();

        // Create object using user input
        Patient p1 = new Patient(id, name, disease, doctor);

        // Save record
        p1.savePatientRecord();

        // Read records
        Patient.readPatientRecords();
    }
}