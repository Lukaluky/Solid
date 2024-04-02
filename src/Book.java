public class Book implements ICatalogItem {
    private String title;
    private String author;
    private int publicationYear;
    private String isbn;

    public Book(String title, String author, int publicationYear, String isbn) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
    }

    @Override
    public void display() {
        System.out.println("Book: " + title + " by " + author + ", " + publicationYear + " [ISBN: " + isbn + "]");
    }
}


