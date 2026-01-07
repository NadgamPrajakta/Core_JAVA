package basics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethod_1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		
		Calculator c = new Calculator();
		
		Method m = Calculator.class.getDeclaredMethod("square", int.class);
		
		m.setAccessible(true);
		
		System.out.println(m.invoke(c, 5));
	}

}


class Calculator {
	
	private int square(int n) {
		
		return n * n;
	}
}