class BankTransferDeadLock {

    static final Object accountA = new Object();
    static final Object accountB = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                synchronized (accountA) {
                    System.out.println("Thread 1 locked Account A");

                    try { Thread.sleep(1000); } catch (Exception e) {}

                    synchronized (accountB) {
                        System.out.println("Thread 1 locked Account B");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (accountB) {
                    System.out.println("Thread 2 locked Account B");

                    try { Thread.sleep(1000); } catch (Exception e) {}

                    synchronized (accountA) {
                        System.out.println("Thread 2 locked Account A");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
