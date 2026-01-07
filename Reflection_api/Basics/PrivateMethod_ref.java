package basics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethod_ref {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		
		Object obj = new Notification();
		
		Class<?> c = obj.getClass();
		
		Method m = c.getDeclaredMethod("Send");
		
		m.setAccessible(true);
		
		m.invoke(obj);
	}

}


class Notification {
	
	private void send() {
		
		System.out.println("Notification sent");
	}
}