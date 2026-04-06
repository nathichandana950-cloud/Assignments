import java.util.*;

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}
class Book {
    private String title;
    private String author;
    private boolean available = true;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() { 
        return title; 
    }
    String getAuthor() { 
        return author; 
    }
    boolean isAvailable() 
    { 
        return available; 
    }

    void issue() { 
        available = false; 
    }
    void giveBack() { 
        available = true; 
    }
}
class Member {
    String name;

    Member(String name) {
        this.name = name;
    }
}
class Library {
    List<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void issueBook(String title) throws BookNotAvailableException {
        for (Book b : books) {
            if (b.getTitle().equals(title) && b.isAvailable()) {
                b.issue();
                System.out.println("Book Issued: " + title);
                return;
            }
        }
        throw new BookNotAvailableException("Book not available");
    }

    void returnBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                b.giveBack();
                System.out.println("Book Returned: " + title);
            }
        }
    }

    void sortByTitle() {
        books.sort(Comparator.comparing(Book::getTitle));
    }

    void showBooks() {
        for (Book b : books) {
            System.out.println(b.getTitle() + " - " + b.getAuthor());
        }
    }
}
public class LibraryManagement {
    public static void main(String[] args) {

        Library lib = new Library();
        lib.addBook(new Book("Java", "James"));
        lib.addBook(new Book("Python", "Guido"));

        try {
            lib.issueBook("Java");
            lib.issueBook("Java");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        lib.returnBook("Java");

        lib.sortByTitle();
        lib.showBooks();
    }
}
