package WiproTrainingDay7;

//Shared Resource
class FoodService
{

// synchronized method → only one thread can execute at a time
public synchronized void process(String taskName) 
{
   try {
       System.out.println(taskName + " started");

       Thread.sleep(2000);

       System.out.println(taskName + " completed");
   } catch (InterruptedException e) {
       System.out.println(taskName + " interrupted");
   }
}
}

//Thread Class
class FoodDelivery extends Thread {

FoodService service;

public FoodDelivery(String name, FoodService service) {
   super(name);
   this.service = service;
}

public void run() {
   service.process(getName());
}
}

//Main Class
public class Multi1 
{

public static void main(String[] args) throws InterruptedException {

   FoodService service = new FoodService(); // shared resource

   FoodDelivery order = new FoodDelivery("Order Processing", service);
   FoodDelivery kitchen = new FoodDelivery("Kitchen Processing", service);
   FoodDelivery delivery = new FoodDelivery("Delivery Processing", service);

//   order.setPriority(Thread.MAX_PRIORITY);
//   kitchen.setPriority(Thread.NORM_PRIORITY);
//   delivery.setPriority(Thread.MIN_PRIORITY);

   order.start();
   kitchen.start();

   System.out.println("Is order Alive? " + order.isAlive());

   //order.join();
   //kitchen.join();

   delivery.start();
   //delivery.join();

   System.out.println("All tasks completed.");
}
}