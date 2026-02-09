class Book {
    private String title;
    private boolean isIssued;
    Book(String t) {
        title = t;
        isIssued = false; 
    }
    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued!");
        }
    }
    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }
}

public class BookIssue {
    public static void main(String[] args) {
        Book b1 = new Book("Comic Book");

        b1.issueBook();   
        b1.issueBook();   
        b1.returnBook();  
        b1.returnBook();  
    }
}
