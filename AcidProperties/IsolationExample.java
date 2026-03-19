class IsolationExample {

    static int balance = 5000;

    public static synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> withdraw(3000));
        Thread t2 = new Thread(() -> withdraw(3000));

        t1.start();
        t2.start();
    }
}