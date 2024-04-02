public class Magazine implements ICatalogItem {
    private String title;
    private String publisher;
    private int publicationYear;
    private String issue;

    public Magazine(String title, String publisher, int publicationYear, String issue) {
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.issue = issue;
    }

    @Override
    public void display() {
        System.out.println("Magazine: " + title + ", Issue " + issue + " (" + publicationYear + "), Publisher: " + publisher);
    }
}

abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }
}

class Librarian extends User {
    public static final boolean CAN_MANAGE_CATALOG = true;

    public Librarian(String name) {
        super(name);
    }
}

class Patron extends User {
    public static final boolean CAN_BORROW_ITEMS = true;

    public Patron(String name) {
        super(name);
    }
}
