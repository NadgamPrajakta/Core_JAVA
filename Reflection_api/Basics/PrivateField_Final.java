package basics;

import java.lang.reflect.Field;

public class PrivateField_Final {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		SecurityToken s = new SecurityToken();
		
		Field f = SecurityToken.class.getDeclaredField("token");
		
		f.setAccessible(true);
		f.set(s, "UVWXYZ999");
		
		System.out.println("updated Token: " + f.get(s));
		
	}

}


class SecurityToken {
	
	private final String token = "ABCDE12345";
}