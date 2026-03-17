import java.util.ArrayList;

public class ForEachMain {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Ravi");
        list.add("Sita");
        list.add("John");

        list.forEach(name -> System.out.println(name));
    }
}