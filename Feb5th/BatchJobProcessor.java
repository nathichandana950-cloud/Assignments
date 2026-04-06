public class BatchJobProcessor {

    public static void main(String[] args) {

        int[] records = {10, -1, 20, 0, 30, -99, 40};

        for (int i = 0; i < records.length; i++) {

            int record = records[i];

            if (record == -99) {
                System.out.println("Critical error detected. Stopping job.");
                break;
            }

            if (record <= 0) {
                System.out.println("Skipping invalid record: " + record);
                continue;
            }

            System.out.println("Processing record: " + record);
        }

        System.out.println("Batch job finished.");
    }
}
