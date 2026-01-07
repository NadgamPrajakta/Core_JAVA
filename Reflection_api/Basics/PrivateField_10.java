package basics;

import java.lang.reflect.Field;

public class PrivateField_10 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		ImmutableData d = new ImmutableData();
		
		Field f = ImmutableData.class.getDeclaredField("value");
		
		f.setAccessible(true);
		f.setInt(d, 444);
		
		System.out.println(f.getInt(d));
	}

}


class ImmutableData {
	
	private final int value = 20;
}