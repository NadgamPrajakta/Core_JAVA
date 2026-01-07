package basics;

import java.lang.reflect.Field;

public class PrivateField_4 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Config c = new Config();
		
		Field f = Config.class.getDeclaredField("debug");
		
		f.setAccessible(true);
		f.set(c, true);
		
		System.out.println(f.get(c));
	}

}


class Config {
	
	private boolean debug = false;
}