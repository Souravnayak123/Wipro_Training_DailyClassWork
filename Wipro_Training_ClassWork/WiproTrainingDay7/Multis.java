package WiproTrainingDay7;


//Thread 1 -> Order Processing
class Order implements Runnable {

 public void run() 
 {
     try {
         for (int i = 1; i <= 5; i++) {
             System.out.println("Order is being processed...");
             Thread.sleep(2000);
         }
  }
     catch (InterruptedException e) 
     {
         System.out.println("Order thread interrupted");
     }
 }
}

//Thread 2 -> Payment Processing
class Payment implements Runnable {

 public void run() {
     System.out.println("Payment is being processed...");
 }
}

//Thread 3 -> Notification
class Notification implements Runnable {

 public void run() {
     System.out.println("Notification sent to user");
 }
}

//Main Class
public class Multis {

 public static void main(String[] args) throws InterruptedException {

     // Step 1: Create task objects (Runnable)
     Order orderTask = new Order();
     Payment paymentTask = new Payment();
     Notification notificationTask = new Notification();

     // Step 2: Convert Runnable into Thread
     Thread t1 = new Thread(orderTask);
     Thread t2 = new Thread(paymentTask);
     Thread t3 = new Thread(notificationTask);

     // Step 3: Start threads (execution begins)
     t1.start();
     t1.join();
     t2.start();
     t3.start();
 }
}