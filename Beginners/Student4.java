package USS.com;

public class Student4 {
	private String name;
	private int rollNo;
	private double marks;
	
	// Constructor
	public Student4(String name, int rollNo, double marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	// Overriding toString() method
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
	

	public static void main(String[] args) {
		
		// Create objects
		Student4 s1 = new Student4("Prajkta", 101, 89.5);
		Student4 s2 = new Student4("Namarta", 102, 90.5);
		
		// Printing objects (toString() is called automatically)
		System.out.println(s1);
		System.out.println(s2);
		
		// Explicit call (same result)
		
		System.out.println(s1.toString());

	}

	

}
