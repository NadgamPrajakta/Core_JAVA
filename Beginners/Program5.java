package USS.com;

class Animal {
	
	//final method
	public final void sound() {
		System.out.println("Animals make sounds");
		}
	
	//Normal method
	
	public void sleep() {
		System.out.println("Animal is sleeping");
		
	}
	
	}

// child class
class Dog extends Animal{
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
	
	}

public class Program5 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();    // calls Animal's final method
		dog.sleep();    // class Dog's overriden method
		
}

}
