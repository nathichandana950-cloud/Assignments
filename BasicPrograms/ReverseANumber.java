public class ReverseANumber {
    public static void main(String[] args) {
        int number = 12345;
        int reverse = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        System.out.println("Original: " + number);
        System.out.println("Reversed: " + reverse);
    }
}
