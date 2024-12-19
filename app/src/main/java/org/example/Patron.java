package org.example;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String patronId;
    private List<Book> borrowedBooks;

    // Constructor
    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Borrow a book by title
    public void borrowBook(Library library, String title) {
        Book book = library.findBookByTitle(title);
        if (book != null) {
            borrowedBooks.add(book);
            library.removeBook(title); // Remove the book from the library
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Book not found or unavailable.");
        }
    }

    // Return a book by title
    public void returnBook(Library library, String title) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                borrowedBooks.remove(book);
                library.addBook(book); // Add the book back to the library
                System.out.println(name + " returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found in borrowed books.");
    }

    // List all borrowed books
    public void listBorrowedBooks() {
        System.out.println(name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book.toString());
        }
    }
}
