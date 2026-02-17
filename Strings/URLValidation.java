public class URLValidation {
    public static void main(String[] args) {

        String url = "https://google.com";

        if (url.startsWith("http://") || url.startsWith("https://")) {
            System.out.println("Valid URL");
        } else {
            System.out.println("Invalid URL");
        }
    }
}
