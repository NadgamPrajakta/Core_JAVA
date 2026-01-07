package basics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethod_4 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		
		MathOps m = new MathOps();
		
		Method method = MathOps.class.getDeclaredMethod("add", int.class, int.class);
		
		method.setAccessible(true);
		
		System.out.println(method.invoke(m, 10, 20));

	}

	
}


class MathOps {
	
	private int add(int a , int b) {
		
		return a + b;
	}
}