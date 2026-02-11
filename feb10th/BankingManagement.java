import java.util.*;
abstract class BankAccount {
    int balance;

    BankAccount(int b) {
        balance = b;
    }

    abstract void withdraw(int amt);
}
class SavingsAccount extends BankAccount {
    SavingsAccount(int b) {
        super(b);
    }

    void withdraw(int amt) {
        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient Balance");
    }
}
class CurrentAccount extends BankAccount {
    CurrentAccount(int b) {
        super(b);
    }

    void withdraw(int amt) {
        balance -= amt; 
    }
}
public class BankingManagement {
    public static void main(String[] args) {

        HashMap<Integer, BankAccount> bank = new HashMap<>();

        bank.put(1, new SavingsAccount(1000));
        bank.put(2, new CurrentAccount(500));

        bank.get(1).withdraw(1200);
        bank.get(2).withdraw(800);

        System.out.println(bank.get(1).balance);
        System.out.println(bank.get(2).balance);
    }
}
