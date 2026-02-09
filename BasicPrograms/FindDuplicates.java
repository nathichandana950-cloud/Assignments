public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        System.out.print("Duplicates: ");

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[i] == arr[k]) {
                        System.out.print(arr[i] + " ");
                        break;
                    }
                }
            }
        }
    }
}

