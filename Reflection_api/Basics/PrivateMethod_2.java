package basics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethod_2 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		
		Method m = Utility.class.getDeclaredMethod("greet");
		
		m.setAccessible(true);
		m.invoke(null);

	}

}


class Utility {
	
	private static void greet() {
		
		System.out.println("Hello from Private static method");
	}
}
