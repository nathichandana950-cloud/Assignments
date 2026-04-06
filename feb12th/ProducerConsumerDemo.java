import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Producer implements Runnable {

    private BlockingQueue<String> queue;

    Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                String order = "Order-" + i;
                System.out.println("Producing " + order);
                queue.put(order); 
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {

    private BlockingQueue<String> queue;

    Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                String order = queue.take();  
                System.out.println("Processing " + order);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(new Producer(queue));
        executor.execute(new Consumer(queue));

        executor.shutdown();
    }
}
