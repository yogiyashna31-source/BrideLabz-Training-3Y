package Level1;
public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Default constructor
    public LibraryBook() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.available = true;
    }

    // Parameterized constructor
    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = (title != null && !title.trim().isEmpty()) ? title : "Unknown Title";
        this.author = (author != null && !author.trim().isEmpty()) ? author : "Unknown Author";
        this.price = (price >= 0) ? price : 0.0;
        this.available = available;
    }

    // Copy constructor
    public LibraryBook(LibraryBook other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.available = other.available;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters
    public void setTitle(String title) {
        this.title = (title != null && !title.trim().isEmpty()) ? title : this.title;
    }

    public void setAuthor(String author) {
        this.author = (author != null && !author.trim().isEmpty()) ? author : this.author;
    }

    public void setPrice(double price) {
        this.price = (price >= 0) ? price : this.price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Method to borrow a book
    public String borrowBook() {
        if (available) {
            available = false;
            return "Book '" + title + "' has been borrowed successfully.";
        } else {
            return "Book '" + title + "' is currently unavailable.";
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create library books
        LibraryBook book1 = new LibraryBook("1984", "George Orwell", 15.99, true); // Available book
        LibraryBook book2 = new LibraryBook("Pride and Prejudice", "Jane Austen", 12.50, false); // Unavailable book
        LibraryBook book3 = new LibraryBook(book1); // Copy of book1

        // Test borrowing
        System.out.println("Attempting to borrow books:");
        System.out.println(book1.borrowBook()); // Should borrow successfully
        System.out.println(book1.borrowBook()); // Should fail (already borrowed)
        System.out.println(book2.borrowBook()); // Should fail (unavailable)
        System.out.println(book3.borrowBook()); // Should borrow successfully (copy is independent)

        // Print book details
        System.out.println("\nBook 1 Details:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: $" + book1.getPrice());
        System.out.println("Available: " + book1.isAvailable());

        System.out.println("\nBook 2 Details:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Price: $" + book2.getPrice());
        System.out.println("Available: " + book2.isAvailable());

        System.out.println("\nBook 3 Details (Copy of Book 1):");
        System.out.println("Title: " + book3.getTitle());
        System.out.println("Author: " + book3.getAuthor());
        System.out.println("Price: $" + book3.getPrice());
        System.out.println("Available: " + book3.isAvailable());
    }
}