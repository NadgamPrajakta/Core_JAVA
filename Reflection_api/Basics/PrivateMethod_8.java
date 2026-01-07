package basics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethod_8 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Class<?> cls = Class.forName("Plugin");
		
		Object obj =cls.getDeclaredConstructor().newInstance();
		
		Method m = cls.getDeclaredMethod("execute");
		
		m.setAccessible(true);
		m.invoke(obj);
	}

}


class Plugin {
	
	private void execute() {
		
		System.out.println("Plugin Executed");
		
	}
}