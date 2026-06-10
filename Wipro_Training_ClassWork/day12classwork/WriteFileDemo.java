package com.wipro.day12classwork;

import java.io.*;

public class WriteFileDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter fw=new FileWriter("Sourav.txt");
			fw.write("Welcome to Java IO Class");
			fw.write("\n Learning File Handling");
			fw.close();
			System.out.println("Data Written Successfully");		
		}
		catch(IOException e)
		{
			System.out.println(e);
			
		}
		
	}

}
