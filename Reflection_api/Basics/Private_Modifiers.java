package basics;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Private_Modifiers {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		
		Field f = Demo.class.getDeclaredField("x");
		
		System.out.println(Modifier.toString(f.getModifiers()));
	}

}


class Demo {
	
	private int x;
}