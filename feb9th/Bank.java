class Account {
    private double balance; 
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount+"/-");
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount+"/-");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    void showBalance() {
        System.out.println("Current Balance: " + balance+"/-");
    }
}
public class Bank {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(20000);   
        acc.withdraw(7990);   
        acc.withdraw(600);   
        acc.showBalance();   
    }
}

