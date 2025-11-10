package equalsMethod;

import java.util.Objects;

public class Book {
	
	String title;
	String author;
	String isbn;
	
	Book(String title, String author, String isbn) {
		
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		
		if(!(obj instanceof Book)) return false;
		
		Book b = (Book) obj;
		
		return isbn.equals(b.isbn);
	}
	
	public int hashCode() {
		return Objects.hash(isbn);
	}

	public static void main(String[] args) {
		
		Book b1 = new Book("Java Basics", "James Gosling", "ISBN123");
		
		Book b2 = new Book("Java Basics", "James Gosling", "ISBN123");
		
		System.out.println(b1.equals(b2));
	}

}
