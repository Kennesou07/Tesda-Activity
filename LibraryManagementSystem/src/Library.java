import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(Member member, Book book) {
        if (book.isAvailable()) {
            member.borrowBook(book);
        } else {
            System.out.println("The book is already borrowed.");
        }
    }

    public void returnBook(Member member, Book book) {
        member.returnBook(book);
    }
}
