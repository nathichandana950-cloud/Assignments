public class ErrorCode {
    public static void main(String[] args) {

        int[] errorCodes = {404, 500, 404, 403, 500, 404, 401, 500, 500};

        int n = errorCodes.length;
        int maxCount = 0;
        int mostFrequent = errorCodes[0];

        System.out.println("Error Code Counts:");

        for (int i = 0; i < n; i++) {
            int count = 1;

            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (errorCodes[i] == errorCodes[k]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue;

            for (int j = i + 1; j < n; j++) {
                if (errorCodes[i] == errorCodes[j]) {
                    count++;
                }
            }

            System.out.println("Error Code " + errorCodes[i] + ": " + count + " times");

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = errorCodes[i];
            }
        }

        System.out.println("\nMost Frequent Error Code: " + mostFrequent + " (" + maxCount + " times)");
    }
}

