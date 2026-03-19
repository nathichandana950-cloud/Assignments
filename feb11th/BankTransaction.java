class BankAccount {

    private int balance = 1000;  
    public synchronized void withdraw(String name, int amount) {

        System.out.println(name + " wants to withdraw " + amount);

        if (balance >= amount) {

            System.out.println(name + " is processing withdrawal...");

            try {
                Thread.sleep(1000);  
            } catch (InterruptedException e) {
            }

            balance = balance - amount;
            System.out.println(name + " withdrawal successful");
            System.out.println("Remaining balance: " + balance);

        } else {
            System.out.println(name + " withdrawal failed (Insufficient balance)");
            System.out.println("Current balance: " + balance);
        }

        System.out.println("--------------------------------");
    }
}

class Customer extends Thread {

    BankAccount account;
    int amount;

    Customer(BankAccount account, String name, int amount) {
        this.account = account;
        this.amount = amount;
        this.setName(name);
    }

    public void run() {
        account.withdraw(getName(), amount);
    }
}

public class BankTransaction {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(); 

        Customer c1 = new Customer(account, "Customer-1", 500);
        Customer c2 = new Customer(account, "Customer-2", 400);
        Customer c3 = new Customer(account, "Customer-3", 300);

        c1.start();
        c2.start();
        c3.start();
    }
}

