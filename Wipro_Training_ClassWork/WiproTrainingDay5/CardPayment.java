package WiproTrainingDay5;

class CardPayment implements Payment 
{

    private String cardNumber;

    public CardPayment(String cardNumber) 
    {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) 
    {
        System.out.println("Processing Card payment using Card No: " + cardNumber);
        paymentSuccess(amount);  // default method
    }
}