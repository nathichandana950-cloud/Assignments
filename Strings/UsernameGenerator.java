public class UsernameGenerator {
    public static void main(String[] args) {

        String name = "Kern Software Solutions";
        String username = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch != ' ' &&
                ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {

                username = username + ch;
            }
        }

        System.out.println(username.toLowerCase());
    }
}
