package Abstraction;

public class Interface2 {

	public static void main(String[] args) {
		
		Animal_2 myDog = new Dog(); // Reference of interface, object of Dog
		
		myDog.sound();
		myDog.sleep();

	}

}

interface Animal_2{
	void sound();          // Abstract method
	void sleep();         // Abstract method
}

// Class implementing the interface

class Dog implements Animal_2{
	
	public void sound() {
		System.out.println("Dog barks");
		}
	
	public void sleep() {
		System.out.println("Dog sleeps");
	}
}
