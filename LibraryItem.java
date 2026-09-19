package LibraryManagementSystem;

public abstract class LibraryItem {

    // Encapsulation
    private int itemId;
    private String title;
    private String publisher;
    private double price;
    private boolean available;

    private static String libraryName;
    private static int totalItems;

    // Default constructor
    public LibraryItem() {
        this(0, "Unknown", "Unknown", 0.0, true);
    }

    // Parameterized constructor
    public LibraryItem(int itemId, String title, String publisher,
                       double price, boolean available) {

        this.itemId = itemId;
        this.title = title;
        this.publisher = publisher;
        this.price = price;
        this.available = available;

        totalItems++;
    }

    // Getters and Setters

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public static String getLibraryName() {
        return libraryName;
    }

    public static void setLibraryName(String libraryName) {
        LibraryItem.libraryName = libraryName;
    }

    public static int getTotalItems() {
        return totalItems;
    }

    // Common behavior
    public void issueItem() {

        if (available) {
            available = false;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    public void returnItem() {

        if (!available) {
            available = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " is already available.");
        }
    }

    // Abstract method
    public abstract void displayDetails();
}
