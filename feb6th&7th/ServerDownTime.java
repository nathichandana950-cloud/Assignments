public class ServerDownTime {

    public static void main(String[] args) {

        int[] status = {1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1};

        int totalDown = 0;
        int longestDown = 0;
        int count = 0;

        for (int i = 0; i < status.length; i++) {
            if (status[i] == 0) {
                totalDown++;
                count++;
                if (count > longestDown) longestDown = count;
            } else {
                count = 0;
            }
        }

        System.out.println("Total Downtime: " + totalDown);
        System.out.println("Longest Continuous Downtime: " + longestDown);
    }
}
