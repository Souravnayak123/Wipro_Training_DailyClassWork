package WiproTrainingDay6;

public class ATM 
{
	private final int correctPin = 1234;

    void insertCard() 
    {
        System.out.println("Card Inserted");
    }

    void enterPin(int pin) throws InvalidPinException 
    {
        if (pin != correctPin) {
            throw new InvalidPinException("Invalid PIN!");//Custom Exception 
        } else {
            System.out.println("PIN Accepted");
        }
    }
	

}
