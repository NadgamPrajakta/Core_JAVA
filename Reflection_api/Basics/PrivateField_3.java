package basics;

import java.lang.reflect.Field;

public class PrivateField_3 {

	public static void main(String[] args) {
		
		Field[] fields = Employee.class.getDeclaredFields();
		
		for(Field f : fields) {
			
			System.out.println(f.getName());		
		}
	}

}


class Employee {
	
	private int id;
	private String name;
}