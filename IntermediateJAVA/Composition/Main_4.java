package Composition;

public class Main_4 {

	public static void main(String[] args) {
		
		Book b = new Book();
		b.read();
	}

}

class Page {
	private int number;
	
	public Page(int number) {
		this.number = number;
	}
	
	public void display() throws Exception {
		
		if(number <= 0)
			
			throw new Exception("Invalid page number..");
		
		System.out.println("Reading page number: " + number);
	}
}


class Book {
	private Page page = new Page(10);
	
	public void read() {
		
		try {
			page.display();
			
			System.out.println("Enjoy reading..");
		}
		
		catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
