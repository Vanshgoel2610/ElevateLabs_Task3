import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        library.addBook(new Books("Mahabharata"));
        library.addBook(new Books("Ramayana"));
        library.addBook(new Books("SrimadBhagavatam"));

        System.out.print("Enter your name: ");
        User user = new User(sc.nextLine());

        boolean running = true;
        System.out.println("--- Library Menu ---");
        System.out.println("1. List books");
        System.out.println("2. Issue book");
        System.out.println("3. Return book");
        System.out.println("4. List your issued Books");
        System.out.println("5. Exit");
        while (running) {
            System.out.print("Choice: ");
            try {
                int choice = sc.nextInt();
                sc.nextLine();  // consumes \n

                switch (choice) {
                    case 1:
                        library.listBooks();
                        break;
                    case 2:
                        System.out.print("Enter book title to issue: ");
                        String issueTitle = sc.nextLine();
                        library.issueBook(issueTitle, user);
                        user.setBooks(issueTitle);
                        break;
                    case 3:
                        System.out.print("Enter book title to return: ");
                        String returnTitle = sc.nextLine();
                        library.returnBook(returnTitle, user);
                        user.removeBooks(returnTitle);
                        break;
                    case 4:
                        user.getAll();
                        break;
                    case 5:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch(Exception e) {
                sc.nextLine(); // consume newline
                System.out.println("Please enter a valid number");
            }
        }

        sc.close();
        System.out.println("Exiting Library. Thank you!");
    }
}