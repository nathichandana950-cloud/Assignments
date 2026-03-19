class Payment {
}

class Inventory {
}

class OrderTask implements Runnable {

    private Payment payment;
    private Inventory inventory;
    private String taskName;

    OrderTask(Payment payment, Inventory inventory, String taskName) {
        this.payment = payment;
        this.inventory = inventory;
        this.taskName = taskName;
    }

    @Override
    public void run() {

        synchronized (payment) {
            System.out.println(taskName + " locked Payment");

            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (inventory) {
                System.out.println(taskName + " locked Inventory");
                System.out.println(taskName + " completed order safely");
            }
        }
    }
}

public class DeadlockPrevention {

    public static void main(String[] args) {

        Payment payment = new Payment();
        Inventory inventory = new Inventory();

        Thread t1 = new Thread(new OrderTask(payment, inventory, "Thread-1"));
        Thread t2 = new Thread(new OrderTask(payment, inventory, "Thread-2"));

        t1.start();
        t2.start();
    }
}
