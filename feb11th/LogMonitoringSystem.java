class LogScanner extends Thread {

    public void run() {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Scanning logs... Cycle " + i);

            try {
                Thread.sleep(5000);   
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }

        System.out.println("Log scanning finished.");
    }
}

public class LogMonitoringSystem {

    public static void main(String[] args) {

        LogScanner scanner = new LogScanner();

        System.out.println("Thread State after creation: " + scanner.getState());

        scanner.start();

        for (int i = 1; i <= 6; i++) {
            try {
                Thread.sleep(2000);   
            } catch (InterruptedException e) {
            }

            System.out.println("Current Thread State: " + scanner.getState());
        }
    }
}

