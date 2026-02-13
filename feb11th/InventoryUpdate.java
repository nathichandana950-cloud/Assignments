class Inventory {

    private int stock = 100;

    void updateStock(int quantity) {

        System.out.println(Thread.currentThread().getName() +
                " trying to update stock");

        synchronized (this) {
            stock = stock - quantity;

            System.out.println(Thread.currentThread().getName() +
                    " updated stock. Remaining: " + stock);
        }

        System.out.println(Thread.currentThread().getName() +
                " update process finished");
    }
}
class Worker extends Thread {

    Inventory inventory;
    int quantity;

    Worker(Inventory inventory, int quantity, String name) {
        this.inventory = inventory;
        this.quantity = quantity;
        setName(name);
    }

    public void run() {
        inventory.updateStock(quantity);
    }
}
public class InventoryUpdate {

    public static void main(String[] args) {

        Inventory inv = new Inventory(); 

        Worker w1 = new Worker(inv, 20, "Worker-1");
        Worker w2 = new Worker(inv, 30, "Worker-2");
        Worker w3 = new Worker(inv, 10, "Worker-3");

        w1.start();
        w2.start();
        w3.start();
    }
}
