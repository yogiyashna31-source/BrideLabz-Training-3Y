package Inheritance_Assignment;

class Book {
    String title;
    int publicationYear;

    Book(String title, int year) {
        this.title = title;
        this.publicationYear = year;
    }
}

class Author extends Book {
    String name, bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
        System.out.println("Author: " + name + " - " + bio);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Author a = new Author("OOP in Java", 2021, "John Doe", "Software Engineer & Author");
        a.displayInfo();
    }
}
