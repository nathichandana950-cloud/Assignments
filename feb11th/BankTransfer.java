class Account {
    int balance = 1000;
}

class Transfer {

    Account accA = new Account();
    Account accB = new Account();

    void transferAtoB() {
        synchronized (accA) {
            System.out.println("Thread 1 locked Account A");

            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (accB) {
                System.out.println("Thread 1 locked Account B");
            }
        }
    }

    void transferBtoA() {
        synchronized (accB) {
            System.out.println("Thread 2 locked Account B");

            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (accA) {
                System.out.println("Thread 2 locked Account A");
            }
        }
    }
}

public class BankTransfer {

    public static void main(String[] args) {

        Transfer t = new Transfer();

        Thread t1 = new Thread(() -> t.transferAtoB());
        Thread t2 = new Thread(() -> t.transferBtoA());

        t1.start();
        t2.start();
    }
}
