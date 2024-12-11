package chatGPTGuidedJavaLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LibraryHashMap {
	
	 private Map<Integer, Book> books; // Collection to store books

	    // Constructor
	    public LibraryHashMap() {
	        this.books = new HashMap<>();
	    }

	    // Add a book to the library
	    public void addBook(Book book) {
	        books.put(book.getID(),book);
	        System.out.println("Book added: " + book.getTitle());
	    }

	    // Display all books in the library
	    public void displayBooks(){
	        if (books.isEmpty()) {
	        	System.out.println("The library is empty.");;
	        } else {
	            System.out.println("Books in the library:");
	            for (Map.Entry<Integer, Book> entry : books.entrySet()) {
	                System.out.println("Book ID: "+entry.getKey()+" Book name: "+entry.getValue());
	            }
	        }
	    }

	    // Search for a book by title
	    public Book searchBookByTitle(String title) throws BookNotFoundException {
	    	Book foundBook = books.values().stream()
	                .filter(book -> book.getTitle().equalsIgnoreCase(title))
	                .findFirst()
	                .orElseThrow(() -> new BookNotFoundException("Book with title \"" + title + "\" not found."));
	        
	        // Confirmation message
	        System.out.println("Book found: " + foundBook);
	        return foundBook;
	    }

	    // Remove a book by ID
	    public void removeBookById(int id) throws BookNotFoundException {
	        if (!books.containsKey(id)) {
	            throw new BookNotFoundException("Book with ID " + id + " not found.");
	        }
	        books.remove(id);
	        System.out.println("Book with ID " + id + " removed.");
	        displayBooks();
	    }

	    // Sort books by title
	    public void sortBooksByTitle() throws BookNotFoundException {
	    	if (books.isEmpty()) {
	            throw new BookNotFoundException("No Books in the Library");
	        }
	        List<Book> sortedBooks = new ArrayList<>(books.values());
	        sortedBooks.sort(Comparator.comparing(Book::getTitle));
	        System.out.println("Sorted order:");
	        sortedBooks.forEach(System.out::println);
	    }
	    
	    //Find unique authors
	    public void findUniqueAuthors() {
	    	Set<String> hset = new HashSet<>();
	    	System.out.println("Unique Authors:");
	    	String authorname = "";
	    	for (Map.Entry<Integer, Book> entry : books.entrySet()) {
                authorname = entry.getValue().getAuthor();
                hset.add(authorname);
            }
	    	System.out.println(hset);
	    }
	    
	    //Find books by a specific author
	    public void searchBookByAuthor(String author) throws AuthorNotFoundException {
	    	List<Book> booksByAuthor = books.values().stream()
	                .filter(book -> book.getAuthor().equalsIgnoreCase(author)).toList();
	        if(booksByAuthor.isEmpty()) {
	        	throw new AuthorNotFoundException("Author "+ author + "not found");
	        }
	        
	        booksByAuthor.forEach(System.out::println);

	    }
	    
	    //Save Library books list to file
	    public void saveLibraryToFile(String filename) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
	            oos.writeObject(books);
	            System.out.println("Library saved successfully to " + filename);
	        } catch (IOException e) {
	            System.out.println("Error saving library: " + e.getMessage());
	        }
	    }

	    //Load library books from the file to the program
	    @SuppressWarnings("unchecked")
	    public void loadLibraryFromFile(String filename) {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
	            books = (Map<Integer, Book>) ois.readObject();
	            System.out.println("Library loaded successfully from " + filename);
	        } catch (FileNotFoundException e) {
	            System.out.println("No existing library file found. Starting with an empty library.");
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Error loading library: " + e.getMessage());
	        }
	    }

}
