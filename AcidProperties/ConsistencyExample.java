class ConsistencyExample {
    public static void main(String[] args) {

        int balance = 2000;
        int withdraw = 3000;

        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Insufficient Balance");
        }

        System.out.println("Current Balance: " + balance);
    }
}
