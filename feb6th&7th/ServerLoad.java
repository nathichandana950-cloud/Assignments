public class ServerLoad {

    public static void main(String[] args) {

        int[] load = {40, 55, 60, 45, 70, 65, 50};

        int high = load[0];
        int low = load[0];
        int sum = 0;

        for (int i = 0; i < load.length; i++) {
            if (load[i] > high)
                high = load[i];

            if (load[i] < low)
                low = load[i];

            sum = sum + load[i];
        }

        System.out.println("Highest Load: " + high);
        System.out.println("Lowest Load: " + low);
        System.out.println("Average Load: " + (sum / load.length));
    }
}

