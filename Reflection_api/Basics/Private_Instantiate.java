package basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Private_Instantiate {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> cls = Class.forName("Dynamic");
		
		Constructor<?> c = cls.getDeclaredConstructor();
		
		c.setAccessible(true);
		c.newInstance();

	}

}


class Dynamic {
	
	private Dynamic() {
		
		System.out.println("dynamic Object Created");
	}
}