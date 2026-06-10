package WiproTrainingDay5;

class UpiPayment implements Payment 
{

    private String upiId;

    public UpiPayment(String upiId)
    {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) 
    {
        System.out.println("Processing UPI payment using ID: " + upiId);
        paymentSuccess(amount);  // calling default method
    }

	
}