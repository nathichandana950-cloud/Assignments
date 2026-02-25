import java.util.ArrayList;

public class TestMethodReference {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Sita");

        list.forEach(name -> System.out.println(name));
    }
}