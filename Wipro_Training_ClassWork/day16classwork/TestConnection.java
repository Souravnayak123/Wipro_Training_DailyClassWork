package com.wipro.day16classwork;
import java.sql.*;

public class TestConnection 
{
	public static void main(String[] args) throws Exception 
	{
		//load the Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/usersdb","root","Sourav@123");
		System.out.println("Connection eastablished");
		Statement st=con.createStatement();
		st.executeUpdate("Update users set username=Sourav where id=1");
		con.close();	
		
	}
	
	

}
