package aggregation;

public class Second_2 {

	public static void main(String[] args) {
	
		Book b1 = new Book("Java Programming");
		
		Library lib = new Library(b1);
		
		lib.showBook();

	}

}


class Book {
	private String title;
	
	public Book(String title) {
		
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}


class Library {
	private Book book;
	
	public Library(Book book) {
		
		this.book = book;
	}
	
	public void showBook() {
		
		try {
			if(book == null)
				
				throw new Exception("no book found..!");
			
			System.out.println("Library has: " + book.getTitle());
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
