package com.wipro.day11classwork;

import java.io.*;

public class IO_ex 
{
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("sai.txt"); // auto create
        fw.write("Hello Java IO");
        fw.close();

        System.out.println("File created and data written");
    }
}
