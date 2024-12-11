package chatGPTGuidedJavaLearning;

import java.io.Serializable;

public class Book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String title;
	private String author;
	
	public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
	
	public int getID() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String toString() {
		return "Book ID:"+id+" Book Title:"+title+" Book Author:"+author;
	}

}
