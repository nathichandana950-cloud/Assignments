public class camelCase {
    public static void main(String[] args) {

        String str = "java string programs";
        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            if (i == 0) {
                result = result + words[i];
            } else {
                result = result + words[i].substring(0,1).toUpperCase() 
                         + words[i].substring(1);
            }
        }

        System.out.println(result);
    }
}
