package chatGPTGuidedJavaLearning;

import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibraryHashMap library = new LibraryHashMap();
		String filename = "library_data.dat";
		
		library.loadLibraryFromFile(filename);
		
		Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while(running) {
        	System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add a Book");
            System.out.println("2. Remove a Book");
            System.out.println("3. Search for a Book by Title");
            System.out.println("4. List All Books");
            System.out.println("5. Sort books by Title");
            System.out.println("6. Find unique authors");
            System.out.println("7. Search Books by Author");
            System.out.println("8. Download EBook");
            System.out.println("9. Get Printed Book");
            System.out.println("10. Save and Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
            case 1: // Add a book
                System.out.println("Choose the type of book to add:");
                System.out.println("1. EBook");
                System.out.println("2. PrintedBook");
                int bookType = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                System.out.print("Enter Book ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                System.out.print("Enter Book Title: ");
                String title = scanner.nextLine();
                
                System.out.print("Enter Book Author: ");
                String author = scanner.nextLine();
                
                if (bookType == 1) {
                    // EBook-specific details
                    System.out.print("Enter Number of Pages: ");
                    int numberOfPages = scanner.nextInt();
                    
                    // Add as EBook
                    library.addBook(new EBook(id, title, author, numberOfPages));
                } else if (bookType == 2) {
                    // PrintedBook-specific details
                    System.out.print("Enter Number of Pages: ");
                    int numberOfPages = scanner.nextInt();
                    
                    System.out.print("Enter Stock: ");
                    int stock = scanner.nextInt();
                    
                    // Add as PrintedBook
                    library.addBook(new PrintedBook(id, title, author, numberOfPages, stock));
                } else {
                    System.out.println("Invalid book type selected.");
                }
                break;

        		
            case 2: //Remove a book by ID
            	System.out.print("Enter the ID of the book to be removed");
            	int removeid = scanner.nextInt();
            	try {
            		library.removeBookById(removeid);
            	}catch(BookNotFoundException e) {
            		System.out.println(e.getMessage());
            	}
            	break;
            	
            case 3: //Search for a book by it's title
            	System.out.print("Enter the title of the book to be searched");
            	String searchtitle = scanner.nextLine();
            	try {
            		library.searchBookByTitle(searchtitle);
            	}catch(BookNotFoundException e) {
            		System.out.println(e.getMessage());
            	}
            	break;
            	
            case 4: //List all Books
            	library.displayBooks();
            	break;
            	
            case 5: //Sort books by title
            	try {
            		library.sortBooksByTitle();
            	}catch(BookNotFoundException e) {
            		System.out.println(e.getMessage());
            	}
            	break;
            	
            case 6: //Find unique authors
            	library.findUniqueAuthors();
            	break;
            	
            case 7: //Search books by author
            	System.out.print("Enter the Author name:");
            	String authorname = scanner.nextLine();
            	try {
            		library.searchBookByAuthor(authorname);
            	}catch(AuthorNotFoundException e){
            		System.out.println(e.getMessage());
            	}
            	break;
            	
            case 8: // Download EBook
                System.out.print("Enter Book ID to download: ");
                int ebookId = scanner.nextInt();
                try {
                    library.downloadEBook(ebookId);
                } catch (BookNotFoundException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 9: // Check Printed Book Stock
                System.out.print("Enter Book ID to check stock: ");
                int printedBookId = scanner.nextInt();
                try {
                    library.checkPrintedBookStock(printedBookId);
                } catch (BookNotFoundException e) {
                    System.out.println(e.getMessage());
                }
                break;
            	
            case 10: //Save and Exit
            	library.saveLibraryToFile(filename);
            	running = false;
            	break;
            	
            default:
            	System.out.println("Invalid choice. Please try again.");
            
            }
            	
            		
        }
        
        scanner.close();

	}

}
