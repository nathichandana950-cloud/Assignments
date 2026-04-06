class Report extends Thread {

    public Report(String name) {
        setName(name);
    }

    public void run() {
        System.out.println(getName() + " started");

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
        }

        System.out.println(getName() + " completed");
    }
}
public class ReportGeneration {

    public static void main(String[] args) throws InterruptedException {

        Report sales = new Report("Sales Report");
        Report inventory = new Report("Inventory Report");
        Report profit = new Report("Profit Report");

        sales.start();
        inventory.start();
        profit.start();

        sales.join();
        inventory.join();
        profit.join();

        System.out.println("All reports completed");
    }
}
