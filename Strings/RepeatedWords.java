public class RepeatedWords {
    public static void main(String[] args) {

        String paragraph = "java is easy and java is powerful";
        String[] words = paragraph.split(" ");

        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    System.out.println("Repeated word: " + words[i]);
                }
            }
        }
    }
}
