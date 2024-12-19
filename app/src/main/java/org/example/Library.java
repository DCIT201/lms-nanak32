package org.example;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Remove a book by title
    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        System.out.println("Book with title '" + title + "' removed.");
    }

    // Find a book by title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Not found
    }

    // List all books
    public void listAllBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
