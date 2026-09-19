package LibraryManagementSystem;

public class Library {

    private LibraryItem[] items;
    private int count;

    public Library() {

        items = new LibraryItem[100];
        count = 0;
    }

    public void addItem(LibraryItem item) {

        if (count < items.length) {

            items[count] = item;
            count++;

            System.out.println("Item added successfully.");
        } else {

            System.out.println("Library is full.");
        }
    }

    public void displayAllItems() {

        for (int i = 0; i < count; i++) {

            items[i].displayDetails();
            System.out.println();
        }
    }

    public void searchItemById(int id) {

        for (int i = 0; i < count; i++) {

            if (items[i].getItemId() == id) {

                System.out.println("Item Found:");
                items[i].displayDetails();

                return;
            }
        }

        System.out.println("Item with ID " + id + " not found.");
    }

    public void searchItemByTitle(String title) {

        for (int i = 0; i < count; i++) {

            if (items[i].getTitle().equals(title)) {

                System.out.println("Item Found:");
                items[i].displayDetails();

                return;
            }
        }

        System.out.println("Item with title " + title + " not found.");
    }

    public void issueItem(int id) {

        for (int i = 0; i < count; i++) {

            if (items[i].getItemId() == id) {

                items[i].issueItem();

                return;
            }
        }

        System.out.println("Item with ID " + id + " not found.");
    }

    public void returnItem(int id) {

        for (int i = 0; i < count; i++) {

            if (items[i].getItemId() == id) {

                items[i].returnItem();

                return;
            }
        }

        System.out.println("Item with ID " + id + " not found.");
    }

    public void displayAvailableItems() {

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (items[i].isAvailable()) {

                items[i].displayDetails();
                System.out.println();

                found = true;
            }
        }

        if (!found) {

            System.out.println("No items are available.");
        }
    }
}