package basics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateField_7 {

	public static void main(String[] args) {
		
		Class<?> c = Database.class;
		
		for(Field f : c.getDeclaredFields());
		
		Field f = null;
		System.out.println("Field: " + f.getName());
		
		for (Method m : c.getDeclaredMethods());
		
		Field m = null;
		System.out.println("Method: " + m.getName());

	}

}


class Database {
	
	private String url;
	private String username;
	private void connect() {
		
	}
}