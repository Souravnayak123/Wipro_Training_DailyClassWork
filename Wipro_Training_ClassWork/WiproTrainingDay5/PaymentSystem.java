package WiproTrainingDay5;

public class PaymentSystem 
{
    public static void main(String[] args) 
    {

        // Static method call
        Payment.paymentGateway();

        Payment p1 = new UpiPayment("sourav@upi");
        p1.pay(500);

        System.out.println();

        Payment p2 = new CardPayment("1234-5678-9876-5432");
        p2.pay(1000);
    }
}