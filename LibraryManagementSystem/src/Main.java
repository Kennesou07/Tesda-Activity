import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        UserDataObjectAccess userDao = new UserDataOAImplement();
        User loggedInUser = null;

        // User authentication loop
        while (loggedInUser == null) {
            System.out.println("Choose an option:");
            System.out.println("1. Sign Up");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Username: ");
                    String username = scanner.nextLine().trim();
                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine().trim();
                    System.out.print("Enter Role (admin/user): ");
                    String role = scanner.nextLine().trim();

                    User newUser = new User(username, password, role);
                    try {
                        userDao.signUp(newUser);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter Username: ");
                    String loginUsername = scanner.nextLine().trim();
                    System.out.print("Enter Password: ");
                    String loginPassword = scanner.nextLine().trim();

                    loggedInUser = userDao.login(loginUsername, loginPassword);

                    if (loggedInUser != null) {
                        System.out.println("Login successful. Welcome, " + loggedInUser.getUsername() + " (Role: " + loggedInUser.getRole() + ")");
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting system...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        // Sample books and members for testing
        library.addBook(new Book("Java Basics", "John Doe", "Programming",true));
        library.addBook(new Book("Effective Java", "Joshua Bloch", "Programming",true));

        Member member = new Member("M001", "Alice");
        library.registerMember(member);

        // Simple command line interface
        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title to Borrow: ");
                    String title = scanner.nextLine();
                    Book bookToBorrow = library.searchBookByTitle(title);
                    if (bookToBorrow != null) {
                        library.borrowBook(member, bookToBorrow);
                        System.out.println("Book borrowed successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Book Title to Return: ");
                    String titleReturn = scanner.nextLine();
                    Book bookToReturn = library.searchBookByTitle(titleReturn);
                    if (bookToReturn != null) {
                        library.returnBook(member, bookToReturn);
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Title to Search: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.searchBookByTitle(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}