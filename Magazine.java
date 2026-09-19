package LibraryManagementSystem;

public class Magazine extends LibraryItem {

    private int issueNumber;
    private String publicationMonth;
    private String category;

    public Magazine() {
        super();
    }

    public Magazine(int itemId, String title, String publisher,
                    double price, boolean available,
                    int issueNumber, String category,
                    String publicationMonth) {

        super(itemId, title, publisher, price, available);

        this.issueNumber = issueNumber;
        this.category = category;
        this.publicationMonth = publicationMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getPublicationMonth() {
        return publicationMonth;
    }

    public void setPublicationMonth(String publicationMonth) {
        this.publicationMonth = publicationMonth;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Polymorphism - Method Overriding
    @Override
    public void displayDetails() {

        System.out.println("----- Magazine Details -----");

        System.out.println("Item ID           : " + getItemId());
        System.out.println("Title             : " + getTitle());
        System.out.println("Publisher         : " + getPublisher());
        System.out.println("Price             : " + getPrice());
        System.out.println("Available         : " + isAvailable());

        System.out.println("Issue Number      : " + issueNumber);
        System.out.println("Publication Month : " + publicationMonth);
        System.out.println("Category          : " + category);
    }
}