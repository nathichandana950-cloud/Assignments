import java.util.ArrayList;

public class MainStream {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        list.stream()
            .filter(num -> num % 2 == 0)
            .forEach(num -> System.out.println(num));
    }
}