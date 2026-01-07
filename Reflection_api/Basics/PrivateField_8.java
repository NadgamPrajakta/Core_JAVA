package basics;

import java.lang.reflect.Field;

public class PrivateField_8 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Profile p = new Profile();
		
		Field f = Profile.class.getDeclaredField("email");
		
		f.setAccessible(true);
		
		f.set(p, "nadgamprajkta@gmail.com");
		
		System.out.println(f.get(p));
	}

}


class Profile {
	
	private String email;
}