import java.util.Scanner;

public class OtpVerification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String originalOTP = "1234";  

        System.out.println("Enter OTP:");
        String userOTP = sc.nextLine();

        if (originalOTP.equals(userOTP)) {
            System.out.println("OTP Verified Successfully");
        } else {
            System.out.println("Invalid OTP");
        }

        sc.close();
    }
}

