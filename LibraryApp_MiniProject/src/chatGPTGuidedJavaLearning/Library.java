package chatGPTGuidedJavaLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Library {
    private List<Book> books; // Collection to store books

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Display all books in the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Search for a book by title
    public void searchBookByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with title \"" + title + "\" not found.");
        }
    }

    // Remove a book by ID
    public void removeBookById(int id) {
        boolean removed = false;
        for (Book book : books) {
            if (book.getID() == id) {
                books.remove(book);
                System.out.println("Book with ID " + id + " removed: " + book.getTitle());
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("No book found with ID: " + id);
        }
    }

    // Sort books by title
    public void sortBooksByTitle() {
        if (books.isEmpty()) {
            System.out.println("The library is empty, nothing to sort.");
            return;
        }
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareToIgnoreCase(b2.getTitle());
            }
        });
        System.out.println("Books sorted by title.");
    }
}

