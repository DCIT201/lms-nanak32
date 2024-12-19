/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {

    public static void main(String[] args) {

            Library library = new Library();


            Book book1 = new Book("A Story of Yesterday", "Kofi Amo", 1966);
            Book book2 = new Book("Kweku Ananse Story", "Ama Atta", 1950);
            Book book3 = new Book("Humpty Dumpty", "Felix Amoh", 200);

            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);

            Patron patron = new Patron("Nana Agyiri", "P001");

            patron.borrowBook(library, "A Story of Yesterday");
            patron.borrowBook(library, "Humpty Dumpty");

            patron.listBorrowedBooks();

            library.listAllBooks();

            patron.returnBook(library, "A Story of Yesterday");

            patron.listBorrowedBooks();

            library.listAllBooks();
        }
}

