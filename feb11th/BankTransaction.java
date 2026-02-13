class Account {

    private int balance = 1000;

    synchronized void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName() +
                " trying to withdraw " + amount);

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(Thread.currentThread().getName() +
                    " withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " insufficient balance");
        }
    }
}
class Customer extends Thread {

    Account account;
    int amount;

    Customer(Account account, int amount, String name) {
        this.account = account;
        this.amount = amount;
        setName(name);
    }

    public void run() {
        account.withdraw(amount);
    }
}
public class BankTransaction {

    public static void main(String[] args) {

        Account acc = new Account();

        Customer c1 = new Customer(acc, 500, "Customer-1");
        Customer c2 = new Customer(acc, 400, "Customer-2");
        Customer c3 = new Customer(acc, 300, "Customer-3");

        c1.start();
        c2.start();
        c3.start();
    }
}
