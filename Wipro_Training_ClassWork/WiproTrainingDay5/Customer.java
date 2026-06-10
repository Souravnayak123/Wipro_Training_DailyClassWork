package WiproTrainingDay5;

import java.util.Scanner;

public class Customer 
{
	final int acc_no;
	String name;
	int balance;
	int deposit;
	int withdraw;
	Customer(int acc_no,String name,int balance,int deposit,int withdraw)
	{
		this.acc_no=acc_no;
		this.name=name;
		this.balance=balance;
		this.deposit=deposit;
		this.withdraw=withdraw;
		
	}
	void display() 
	{
        System.out.println("Account No: " + acc_no);
        System.out.println("Name: " + name);
    }
	
	

}
