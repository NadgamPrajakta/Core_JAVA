package Abstraction;

public class Interface4 {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.start();
		myCar.fuel();               // default method call
		
		Vehicle.service();         // static method call 
	}

}

interface Vehicle {
	void start();
	
	// Default method
	
	default void fuel() {
		System.out.println("Vehicle needs fuel");
	}
	
	static void service() {
		System.out.println("Vehicle needs servicing");
	}
}

class Car implements Vehicle {
	
	public void start() {
		System.out.println("Car starts with key");
	}
}