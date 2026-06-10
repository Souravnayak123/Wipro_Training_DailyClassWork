package WiproTrainingDay5;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) 
	{
		Customer c=new Customer(1020,"Sourav",30000,2000,1500);
		
		//c.acc_no=1221;
		System.out.println("Modified the name");
		c.name="Gourav";
		c.display();
		BankingApplication b=new BankingApplication();
		//System.out.println("Process Payment Started");
		b.processPayment(c.balance,c.deposit,c.withdraw);
		SecureModule sm = new SecureModule();
        String result = sm.encrypt("Payment");
        System.out.println(result);
		
		
		
		
		
		

	}
	final void processPayment(int b,int d,int w)
	{
		System.out.println("Process Payment Occurs");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Depsoit tha balance");
				//if(b)
				b=b+d;
				System.out.println("Balance is"+b);
				break;
			case 2:
				System.out.println("withdraw the balance");
				if(b>w)
				{
					b=b-w;
					System.out.println("Balance is"+b);
					break;
					
				}
			default:
				{
					System.out.println("withdraw can not be possible");
				}
		
		}
		//b=b+d;
		
		
	}

}
