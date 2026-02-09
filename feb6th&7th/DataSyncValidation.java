public class DataSyncValidation {

    public static void main(String[] args) {

        int[] source = {10, 20, 30, 40, 50};
        int[] destination = {10, 20, 35, 40, 50};

        boolean identical = true;

        System.out.println("Mismatched Indexes:");

        for (int i = 0; i < source.length; i++) {
            if (source[i] != destination[i]) {
                System.out.println("Index " + i + ": source=" + source[i] + ", destination=" + destination[i]);
                identical = false;
            }
        }

        if (identical) {
            System.out.println("Source and Destination arrays are identical.");
        }
    }
}
