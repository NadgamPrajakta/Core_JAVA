package basics;

import java.lang.reflect.Constructor;

public class PrivateField_6 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Constructor<AppConfig> c = AppConfig.class.getDeclaredConstructor();
		
		c.setAccessible(true);
		
		AppConfig obj1 = AppConfig.getInstance();	
		
		AppConfig obj2 = AppConfig.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
   
	}
}


class AppConfig {
	
	private static AppConfig instance = new AppConfig();
	
	private AppConfig() {
		
		System.out.println("Private Constructor");
	}
	
	public static AppConfig getInstance() {
		
		return instance;
	}
}