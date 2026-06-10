package com.wipro.day12classwork;

import java.io.*;

public class CreateFileDemo 
{

	public static void main(String[] args) 
	{
		try
		{
			File file=new File("Sourav.txt");
			if(file.createNewFile())
			{
				System.out.println("File Created Successfully");
			}
			else
			{
				System.out.println("File already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
			
		}
		
		

	}

}
