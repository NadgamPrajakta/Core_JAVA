package basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateCtors_5 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Constructor<Vehicle> c = Vehicle.class.getDeclaredConstructor(String.class, int.class);
		
		c.setAccessible(true);
		c.newInstance("Tesla", 2025);
		
	}

}


class Vehicle {
	
	private Vehicle(String model, int year) {
		
		System.out.println(model + " - " + year);
	}
}