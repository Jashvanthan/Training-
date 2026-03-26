import java.util.*;

class Item {
    protected String title;
    protected String author;
    protected int year;

    public Item(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
    }
}

class Book extends Item {
    private String isbn;

    public Book(String title, String author, int year, String isbn) {
        super(title, author, year);
        this.isbn = isbn;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("ISBN: " + isbn);
    }
}

class Magazine extends Item {
    private int issueNumber;

    public Magazine(String title, String author, int year, int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class LibraryManagementSystem {
    private static ArrayList<Item> items = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Display All Items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    addMagazine(sc);
                    break;
                case 3:
                    displayItems();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    private static void addBook(Scanner sc) {
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

        Book book = new Book(title, author, year, isbn);
        items.add(book);
        System.out.println("Book added successfully!");
    }

    private static void addMagazine(Scanner sc) {
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter issue number: ");
        int issueNumber = sc.nextInt();
        sc.nextLine(); // consume newline

        Magazine magazine = new Magazine(title, author, year, issueNumber);
        items.add(magazine);
        System.out.println("Magazine added successfully!");
    }

    private static void displayItems() {
        if (items.isEmpty()) {
            System.out.println("No items to display.");
        } else {
            System.out.println("\nAll Items:");
            for (Item item : items) {
                item.display();
                System.out.println();
            }
        }
    }
}
