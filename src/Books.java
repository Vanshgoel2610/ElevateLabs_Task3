public class Books {
    private boolean isIssued;
    private final String title;

    Books(String title) {
        this.title = title;
        isIssued = false;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void returnBook() {
        isIssued = false;
    }

    public void issue() {
        isIssued = true;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Book{title='" + title + "', isIssued=" + isIssued + "}";
    }
}