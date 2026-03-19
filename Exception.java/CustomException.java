class MyException extends Exception {

    MyException(String message) {
        super(message);
    }
}

public class CustomException {

    public static void main(String[] args) {

        int marks = 30;

        try {
            if (marks < 35) {
                throw new MyException("Fail in Exam");
            }
            System.out.println("Pass");
        } 
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}