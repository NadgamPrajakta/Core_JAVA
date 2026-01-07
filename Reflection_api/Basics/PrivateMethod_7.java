package basics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethod_7 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		
		Child c = new Child();
		
		Method m = Parent.class.getDeclaredMethod("Show");
		
		m.setAccessible(true);
		m.invoke(c);

	}

}


class Parent {
	
	private void show() {
		
		System.out.println("Parent Private Method");
	}
}

class Child extends Parent {
	
}