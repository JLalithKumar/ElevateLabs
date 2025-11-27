import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void issueBook(int bookId, int userId) {
        Book book = findBook(bookId);
        User user = findUser(userId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        if (book.isIssued()) {
            System.out.println("Book is already issued.");
        } else {
            book.issueBook();
            System.out.println(" " + user.getName() + " issued " + book.getTitle());
        }
    }

    public void returnBook(int bookId) {
        Book book = findBook(bookId);
        if (book != null && book.isIssued()) {
            book.returnBook();
            System.out.println("Book returned: " + book.getTitle());
        } else {
            System.out.println("Book not found or not issued.");
        }
    }

    private Book findBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) return b;
        }
        return null;
    }

    private User findUser(int userId) {
        for (User u : users) {
            if (u.getUserId() == userId) return u;
        }
        return null;
    }

    public void showBooks() {
        System.out.println("\n📚 Book List:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void showUsers() {
        System.out.println("\n👥 User List:");
        for (User u : users) {
            System.out.println(u);
        }
    }
}
