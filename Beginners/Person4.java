package USS.com;
import java.util.Scanner;

class Person4{
	String name;
	int age;
	
	// Default Constructor
	Person4(){
		name ="Unkonwn";
		age = 0;
		System.out.println("Default Person constructor called.");
		
		}
	// Parameterized Constructor
		Person4(String name, int age){
				this.name = name;
				this.age = age;
				System.out.println("Parameterized Person constructor called.");
	}
		
		// Copy Constructor
		Person4(Person4 other){
			this.name = other.name;
			this.age = other.age;
			System.out.println("Copy Person constructor called.");
		}
		
		void display() {
			System.out.println("Name:"+name +", Age:"+age);
		}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Default constructor
		
		System.out.println("Person : Default constructor----");
		
		Person4 p1= new Person4();
		p1.display();
		
		// Parameterized constructor
		
		System.out.println("Enter Person Name:");
		String name = sc.nextLine();
		System.out.println("Enter Person Age:");
		int age = sc.nextInt();
		System.out.println("Person : Parameterized constructor---");
		
		Person4 p2 = new Person4(name, age);
		p2.display();
		
		// Copy constructor
		System.out.println("Person : Copy constructor----");
		Person4 p3 = new Person4(p2);
		p3.display();
		sc.close();
		

	}

}
