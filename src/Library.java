import java.util.ArrayList;

public class Library {
    private final ArrayList<Books> books = new ArrayList<>();

    public void addBook(Books book) {
        books.add(book);
    }

    public void issueBook(String title, User user) {
        for (Books book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isIssued()) {
                    book.issue();
                    System.out.println("Book \"" + title + "\" issued to " + user.getName());
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title, User user) {
        for (Books book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book \"" + title + "\" returned by " + user.getName());
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void listBooks() {
        for (Books book : books) {
            System.out.println(book.getTitle() + " - " + (book.isIssued() ? "Issued" : "Available"));
        }
    }
}