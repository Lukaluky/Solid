import java.util.Scanner;

public class LibraryCLI {
    public static void main(String[] args) {
        CatalogManager catalogManager = new CatalogManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Catalog System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. List Items");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int bookYear = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    Book book = new Book(bookTitle, author, bookYear, isbn);
                    catalogManager.addItem(book);
                    break;
                case 2:
                    System.out.print("Enter magazine title: ");
                    String magazineTitle = scanner.nextLine();
                    System.out.print("Enter publisher: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int magYear = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter issue number: ");
                    String issue = scanner.nextLine();
                    Magazine magazine = new Magazine(magazineTitle, publisher, magYear, issue);
                    catalogManager.addItem(magazine);
                    break;
                case 3:
                    catalogManager.listItems();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
