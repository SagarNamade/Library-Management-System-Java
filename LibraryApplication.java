package LibraryManagementSystem;

public class LibraryApplication {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book(
                101,
                "Java",
                "Oracle",
                500.0,
                true,
                "Mr. James",
                "ISBN101",
                500,
                1
        );

        Book book2 = new Book(
                102,
                "HTML",
                "XYZ",
                400.0,
                true,
                "Mr. Tim",
                "ISBN102",
                350,
                2
        );

        Magazine magazine = new Magazine(
                103,
                "Tech",
                "Tech India",
                200.0,
                true,
                25,
                "Technology",
                "September"
        );

        // Adding items
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(magazine);

        System.out.println("\n=== ALL LIBRARY ITEMS ===");

        library.displayAllItems();

        System.out.println("\n=== SEARCH BY ID ===");

        library.searchItemById(101);

        System.out.println("\n=== SEARCH BY TITLE ===");

        library.searchItemByTitle("HTML");

        System.out.println("\n=== ISSUE ITEM ===");

        library.issueItem(101);

        System.out.println("\n=== AVAILABLE ITEMS ===");

        library.displayAvailableItems();

        System.out.println("\n=== RETURN ITEM ===");

        library.returnItem(101);

        System.out.println("\n=== AVAILABLE ITEMS AFTER RETURN ===");

        library.displayAvailableItems();

        System.out.println("\nTotal Items : "
                + LibraryItem.getTotalItems());
    }
}