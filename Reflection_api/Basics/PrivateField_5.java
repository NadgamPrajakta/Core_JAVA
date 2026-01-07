package basics;

import java.lang.reflect.Field;

public class PrivateField_5 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Secret s = new Secret();
		
		Field f = Secret.class.getDeclaredField("key");
		
		f.setAccessible(true);
		
		System.out.println("Key: " + f.get(s));
		
			
	}

}


class Secret {
	
	private String key = "12345";
}