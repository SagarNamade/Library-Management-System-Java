package LibraryManagementSystem;

public class Book extends LibraryItem {

    // Encapsulation
    private String author;
    private String isbn;
    private int pages;
    private int edition;

    public Book() {
        super();
    }

    public Book(int itemId, String title, String publisher,
                double price, boolean available,
                String author, String isbn,
                int pages, int edition) {

        super(itemId, title, publisher, price, available);

        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.edition = edition;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    // Polymorphism - Method Overriding
    @Override
    public void displayDetails() {

        System.out.println("----- Book Details -----");

        System.out.println("Item ID       : " + getItemId());
        System.out.println("Title         : " + getTitle());
        System.out.println("Publisher     : " + getPublisher());
        System.out.println("Price         : " + getPrice());
        System.out.println("Available     : " + isAvailable());

        System.out.println("Author        : " + author);
        System.out.println("ISBN          : " + isbn);
        System.out.println("Pages         : " + pages);
        System.out.println("Edition       : " + edition);
    }
}
