public class ArmStrong {

    public static void main(String[] args) {

        int number = 153;
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
        }

        if (sum == number)
            System.out.println("ArmStrong Number");
        else
            System.out.println("Not an ArmStrong Number");
    }
}
