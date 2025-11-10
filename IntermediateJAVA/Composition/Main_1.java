package Composition;

public class Main_1 {

	public static void main(String[] args) {
		
		Car c1 = new Car("Diesel");
		c1.drive();
		
		Car c2 = new Car("");
		c2.drive();

	}

}

class Engine {
	private String type;
	
	public Engine(String type) {
		
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void start() throws Exception {
		if (type == null || type.isEmpty())
			
			throw new Exception("Engine type not specified..!");
		
		System.out.println(type + " engine started...");
	}
}

class Car {
	
	private Engine engine;
	
	public Car(String type) {
		engine = new Engine(type);
	}
	
	public void drive() {
		
		try {
			engine.start();
			System.out.println("Car is running...");
		}
		
		catch(Exception ex) {
			System.out.println("Error:" + ex.getMessage());
		}
	}
}
