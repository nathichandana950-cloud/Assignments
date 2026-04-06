class Order implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+":order validation");
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + " : Payment Processing");
        try{
        Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + ": Order completed");
    }
}
public class OrderProcessing {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            Order order = new Order();
            Thread t = new Thread(order); 
            t.setName("Order-" + i); 
            t.start();          
        }
        
    }
    
}
