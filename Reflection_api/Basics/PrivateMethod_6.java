package basics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethod_6 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		
		Method m = Logger.class.getDeclaredMethod("log", String.class);
		
		m.setAccessible(true);
		
		m.invoke(null, "System started");
	}

}


class Logger {
	
	private static void log(String msg) {
		
		System.out.println("LOG: " + msg);
	}
}