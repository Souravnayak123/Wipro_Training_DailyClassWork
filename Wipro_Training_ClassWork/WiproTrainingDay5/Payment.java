package WiproTrainingDay5;

public interface Payment 
{
	void pay(double amount);
	
	 static void paymentGateway() 
	 {
	        System.out.println("Welcome to Payment Gateway");
	 }
	 
	 default void paymentSuccess(double amount)
	 {
			
			 System.out.println("Payment of Rs." + amount + " completed successfully.");
			
	 }
	

}
