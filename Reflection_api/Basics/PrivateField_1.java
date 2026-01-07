package basics;

import java.lang.reflect.Field;

public class PrivateField_1 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		User u = new User();
		
		Field f = User.class.getDeclaredField("name");
		
		f.setAccessible(true);
		
		System.out.println(f.get(u));

	}

}


class User {
	
	private String name = "Prajkta";

}