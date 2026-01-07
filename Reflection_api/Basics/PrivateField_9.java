package basics;

import java.lang.reflect.Field;

public class PrivateField_9 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		FeatureToggle f = new FeatureToggle();
		
		Field field = FeatureToggle.class.getDeclaredField("enabled");
		
		field.setAccessible(true);
		
		field.setBoolean(f, true);
		
		System.out.println(field.getBoolean(f));

	}

}


class FeatureToggle {
	
	private boolean enabled = false;
}