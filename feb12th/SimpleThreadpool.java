import java.util.concurrent.*;

public class SimpleThreadpool {

    public static void main(String[] args) {

        int coreSize = 2;
        int maxSize = 4;
        long keepAliveTime = 10;

        BlockingQueue<Runnable> queue =
                new ArrayBlockingQueue<Runnable>(5);

        ExecutorService executor =new ThreadPoolExecutor(coreSize,maxSize,keepAliveTime,TimeUnit.SECONDS,queue);

        for (int i = 1; i <= 30; i++) {

            final int taskNumber = i;

            System.out.println("Submitting Task " + taskNumber);

            executor.execute(new Runnable() {
                public void run() {

                    System.out.println("Task " + taskNumber +" running by " +Thread.currentThread().getName());

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Task " + taskNumber + " completed");
                }
            });
        }

        executor.shutdown();

        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("Executor closed properly.");
    }
}
