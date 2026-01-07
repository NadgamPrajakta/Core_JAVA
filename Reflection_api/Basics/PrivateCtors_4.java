package basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class PrivateCtors_4 {

	public static void main(String[] args) {
		
		Constructor<?>[] cons = Engine.class.getDeclaredConstructors();
		
		for(Constructor<?> c : cons) 
			
			System.out.println(Modifier.toString(c.getModifiers()));

	}

}


class Engine {
	
	private Engine() {
		
	}
}