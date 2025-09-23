package USS.com;
import java.util.Scanner;

class Person{
	String name;
	int age;
	
	//Defalut constructor
	
	public Person() {
		name = "Unknown";
		age = 0;
	}
	
	//Parameterized constructor
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//copy constructor
	
	public Person(Person other) {
		this.name=other.name;
		this.age=other.age;
	}
	
	void display() {
		
		System.out.println("Name:"+name +", Age:"+age);
	}
}

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Default constructor
		Person p1 = new Person();
		System.out.println("Default Constructor:");
		p1.display();
		
		//Parameterized Contsructor with scanner input 
		
		System.out.println("Enter name:");
		String name = sc.nextLine();
		System.out.println("Enter age:");
		int age = sc.nextInt();
		
		Person p2 = new Person(name, age);
		
		System.out.print("Parameterized Constructor:");
		p2.display();
		
		// copy constructor
		
		Person p3 = new Person(p2);
		
		System.out.print("Copy Constructor:");
		p3.display();
		
	
	}

}
