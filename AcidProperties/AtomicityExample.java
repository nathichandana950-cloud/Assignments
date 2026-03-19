class AtomicityExample {
    public static void main(String[] args) {

        int accountA = 5000;
        int accountB = 3000;
        int amount = 1000;

        System.out.println("Before Transfer:");
        System.out.println("A: " + accountA);
        System.out.println("B: " + accountB);

        try {
            accountA = accountA - amount;
            if (amount > 500) {   
                throw new Exception("Transfer Failed!");
            }
            accountB = accountB + amount;

        } catch (Exception e) {
            accountA = accountA + amount;
            System.out.println("Transaction Cancelled");
        }

        System.out.println("After Transfer:");
        System.out.println("A: " + accountA);
        System.out.println("B: " + accountB);
    }
}
