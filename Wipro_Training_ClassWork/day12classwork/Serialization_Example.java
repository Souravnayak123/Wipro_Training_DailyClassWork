package com.wipro.day12classwork;

import java.io.Serializable;
import java.io.*;

//Serializable class
class Student implements Serializable
{
 int id;
 String name;

 Student(int id, String name)
 {
     this.id = id;
     this.name = name;
 }
}

public class Serialization_Example
{
 public static void main(String[] args)
 {
     try
     {
         // Object creation
         Student s1 = new Student(101, "Sourav");

         // Serialization
         FileOutputStream fos =
                 new FileOutputStream("data.txt");

         ObjectOutputStream oos =
                 new ObjectOutputStream(fos);

         oos.writeObject(s1);

         System.out.println("Object Serialized");

         oos.close();
         fos.close();
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
 }
}

