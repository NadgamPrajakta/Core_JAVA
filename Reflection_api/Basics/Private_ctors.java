package basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Private_ctors {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Constructor<Student_1> c = Student_1.class.getDeclaredConstructor();
		
		c.setAccessible(true);
		
		Student_1 s = c.newInstance();
		
//		System.out.println("************");

	}

}


class Student_1 {
	
	private Student_1() {
		
		System.out.println("Private Constructor called");
	}
}