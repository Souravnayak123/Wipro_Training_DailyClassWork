package WiproTrainingDay7;

class FoodService1 
{

    public synchronized void process(String name) {
        System.out.println(name + " started");

        try {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " completed");
    }
}

class FoodDelivery1 extends Thread {

    // Shared object for all threads
    static FoodService service = new FoodService();

    FoodDelivery1(String name) {
        super(name);
    }

    @Override
    public void run() {
        service.process(getName());
    }
}

public class Synchronized {

    public static void main(String[] args)
    {

        FoodDelivery1 t1 = new FoodDelivery1("Order");
        FoodDelivery1 t2 = new FoodDelivery1("Kitchen");
        FoodDelivery1 t3 = new FoodDelivery1("Delivery");

        t1.start();
        t2.start();
        t3.start();
    }
}