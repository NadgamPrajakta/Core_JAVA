
// Multiple Interfaces Example

package Abstraction;

public class Interface3 {

	public static void main(String[] args) {
		
		Report obj = new Report();
		
		obj.print();
		obj.show();
	}

}


interface Printable {
	void print();
}

interface Showable {
	void show();
}

// class implementing multiple interfaces

class Report implements Printable, Showable {
	
	public void print() {
		System.out.println("Printing Report...");
	}
	
	public void show() {
		System.out.println("Showwing Report...");
	}
}