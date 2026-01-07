package basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateCtors_1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	   
		Constructor<Product> c = Product.class.getDeclaredConstructor(String.class);
		
		c.setAccessible(true);
		c.newInstance("Laptop");

	}

}


class Product {
	
	private Product(String name) {
		
		System.out.println("Product: " + name);
	}
}