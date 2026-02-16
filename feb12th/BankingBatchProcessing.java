import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class InterestCalculator implements Callable<Double> {

    double principal;
    double rate;

    InterestCalculator(double principal, double rate) {
        this.principal = principal;
        this.rate = rate;
    }

    public Double call() throws Exception {

        System.out.println("Calculating interest for amount: " + principal);

        Thread.sleep(2000); 

        double interest = (principal * rate) / 100;

        return interest;  
    }
}

public class BankingBatchProcessing {

    public static void main(String[] args) throws Exception {

        InterestCalculator acc1 = new InterestCalculator(10000, 5);
        InterestCalculator acc2 = new InterestCalculator(20000, 5);
        InterestCalculator acc3 = new InterestCalculator(30000, 5);

        FutureTask<Double> f1 = new FutureTask<>(acc1);
        FutureTask<Double> f2 = new FutureTask<>(acc2);
        FutureTask<Double> f3 = new FutureTask<>(acc3);

        Thread t1 = new Thread(f1);
        Thread t2 = new Thread(f2);
        Thread t3 = new Thread(f3);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Interest 1: " + f1.get());
        System.out.println("Interest 2: " + f2.get());
        System.out.println("Interest 3: " + f3.get());

        System.out.println("Batch processing completed.");
    }
}

