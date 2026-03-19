interface MyInterface {

    void show();

    default void message() {
        System.out.println("This is default method");
    }
}

class Demo implements MyInterface {

    public void show() {
        System.out.println("Show method");
    }
}

public class DefaultMain {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.show();
        d.message();
    }
}