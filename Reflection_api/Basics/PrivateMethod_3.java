package basics;

import java.lang.reflect.Method;

public class PrivateMethod_3 {

	public static void main(String[] args) {
		
		Method[] methods = Service.class.getDeclaredMethods();
		
		for(Method m : methods) {
			
			System.out.println(m.getName());
		}

	}

}


class Service {
	
	private void start() {
		
	}
	
	private void stop() {
		
	}
}
