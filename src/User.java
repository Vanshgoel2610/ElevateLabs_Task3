import java.util.ArrayList;
import java.util.List;

public class User {
    private final String name;
    private List<String> books = new ArrayList<>();

    User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBooks(String book) {
        books.add(book);
    }

    public void removeBooks(String book) {
        books.remove(book);
    }

    public void getAll() {
        for(String book: books) {
            System.out.println(book);
        }
    }
}