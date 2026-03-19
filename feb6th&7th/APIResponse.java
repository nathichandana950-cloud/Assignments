public class APIResponse {

    public static void main(String[] args) {

        int[] responseTimes = {1200, 2500, 1800, 3000, 900, 2200, 1500};

        int sum = 0;

        System.out.println("Slow APIs (>2000 ms):");

        for (int i = 0; i < responseTimes.length; i++) {

            sum += responseTimes[i]; 

            if (responseTimes[i] > 2000) {
                System.out.println("API " + (i + 1) + ": " + responseTimes[i] + " ms");
            }
        }

        double average = (double) sum / responseTimes.length;
        System.out.println("\nAverage Response Time: " + average + " ms");
    }
}

