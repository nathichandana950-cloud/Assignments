public class RemoveHTML {
    public static void main(String[] args) {

        String text = "<h1>Hello</h1>";
        String result = "";

        boolean insideTag = false;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch == '<') {
                insideTag = true;   
            }
            else if (ch == '>') {
                insideTag = false;  
            }
            else if (!insideTag) {
                result = result + ch;  
            }
        }

        System.out.println("Output: " + result);
    }
}
