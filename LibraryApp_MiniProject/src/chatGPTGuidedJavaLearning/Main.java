	package chatGPTGuidedJavaLearning;

public class Main {

	public static void main(String[] args) throws BookNotFoundException {
		// TODO Auto-generated method stub
		//Library library = new Library();
		LibraryHashMap libhmap = new LibraryHashMap();

		 // Adding books
	    libhmap.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
	    libhmap.addBook(new Book(2, "1984", "George Orwell"));
	    libhmap.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee"));
	    libhmap.addBook(new Book(4, "Oliver Twist", "Charles Dickens"));
	    libhmap.addBook(new Book(5, "Harry Potter Series", "J.K. Rowling"));
	    libhmap.addBook(new Book(6, "Death on the nile", "Agatha Christy"));
	    libhmap.addBook(new Book(7, "Murder on the Orient Express", "Agatha Christy"));
	    libhmap.addBook(new Book(8, "A Christmas Carol", "Charles Dickens"));

	    // Display all books
	    System.out.println("=== Display All Books ===");
	    libhmap.displayBooks();

	    // Search for a book by title
	    System.out.println("\n=== Search for Book ===");
	    try {
	        libhmap.searchBookByTitle("1984");
	        libhmap.searchBookByTitle("Moby Dick"); // Non-existent book
	    } catch (BookNotFoundException e) {
	        System.out.println(e.getMessage());
	    }

	    // Remove a book by ID
	    System.out.println("\n=== Remove Book by ID ===");
	    try {
	        libhmap.removeBookById(1);
	        libhmap.removeBookById(10); // Invalid ID
	    } catch (BookNotFoundException e) {
	        System.out.println(e.getMessage());
	    }

	    // Display sorted books by title
	    System.out.println("\n=== Books Sorted by Title ===");
	    try {
	    	 libhmap.sortBooksByTitle();
	    } catch (BookNotFoundException e) {
	        System.out.println(e.getMessage());
	    }	   
	    
	    //Display Unique Authors in the library
	    System.out.println("\n=== Find Unique Authors ===");
	    libhmap.findUniqueAuthors();
	    
	  //Find books by a specific author
	    System.out.println("\n=== Find Books by author ===");
	    try {
	    	libhmap.searchBookByAuthor("Agatha Christy");
	    	libhmap.searchBookByAuthor("Sheldon");// Non-existent book
	    } catch (AuthorNotFoundException e) {
	        System.out.println(e.getMessage());
	    }

	}

}

//Adding books to the library
		/*
		 * library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
		 * library.addBook(new Book(2, "1984", "George Orwell")); library.addBook(new
		 * Book(3, "To Kill a Mockingbird", "Harper Lee"));
		 * 
		 * // Display all books library.displayBooks();
		 * 
		 * // Search for a book by title System.out.println();
		 * library.searchBookByTitle("1984"); library.searchBookByTitle("Moby Dick");
		 * library.removeBookById(1); library.sortBooksByTitle();
		 */
