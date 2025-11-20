package custom_map_if;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Second {

	public static void main(String[] args) {
		
		Map<Book, String> map = new HashMap<Book, String>();
		
		map.put(new Book(1, "Java", "Herbert Schildt"), "Java");
		map.put(new Book(2, "Victory City", "Salman Rushdie"), "Python");
		map.put(new Book(3, "Lal Salam", "Smriti Irani"), "C++");
		map.put(new Book(4, "Monsoon", "Sahitya Akademi"), "HTML");
		
		System.out.println(map);	

	}

}


class Book {
	
	int bookId;
	String name; 
	String Author;
	
	
	public Book(int bookId, String name, String author) {
		super();
		this.bookId = bookId;
		this.name = name;
		Author = author;
	}

	

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", Author=" + Author + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(Author, bookId, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(Author, other.Author) && bookId == other.bookId && Objects.equals(name, other.name);
	}
	
	
}