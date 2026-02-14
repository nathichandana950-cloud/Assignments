import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BankAccount {

    private int balance = 10000;

    public synchronized void withdraw(String user, int amount) {

        System.out.println(user + " is trying to withdraw " + amount);

        if (balance >= amount) {
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = balance - amount;
            System.out.println(user + " withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println(user + " withdrawal failed. Insufficient balance: " + balance);
        }
    }
}

class ATMUser implements Runnable {

    private BankAccount account;
    private String userName;
    private int amount;

    ATMUser(BankAccount account, String userName, int amount) {
        this.account = account;
        this.userName = userName;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(userName, amount);
    }
}

public class ATMSimulation {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(new ATMUser(account, "User-1", 3000));
        executor.execute(new ATMUser(account, "User-2", 4000));
        executor.execute(new ATMUser(account, "User-3", 2000));
        executor.execute(new ATMUser(account, "User-4", 1000));
        executor.execute(new ATMUser(account, "User-5", 3000));

        executor.shutdown();
    }
}
