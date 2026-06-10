package WiproTrainingDay6;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        ATM atm = new ATM();
        Scanner sc=new Scanner(System.in);
        

        try {
            atm.insertCard();
            System.out.println("Enter Pin");
            int pin=sc.nextInt();
            atm.enterPin(pin);  
            System.out.println("Transaction Successful");
        } 
        catch (InvalidPinException e)
        {
            System.out.println("Exception: " + e.getMessage());
        } 
        finally 
        {
            System.out.println("Transaction Logged (finally block)");
            sc.close();
        }
    }
}