class Payment extends Thread {

    public void run() {

        System.out.println(getName() + " payment started");

        try {
            int delay = (int)(Math.random() * 3000) + 1000;
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println(getName() + " payment completed");
    }
}

public class PaymentGateway {

    public static void main(String[] args) {

        Payment p1 = new Payment();
        Payment p2 = new Payment();
        Payment p3 = new Payment();

        p1.setName("User-1");
        p2.setName("User-2");
        p3.setName("User-3");

        p1.start();
        p2.start();
        p3.start();
    }
}
