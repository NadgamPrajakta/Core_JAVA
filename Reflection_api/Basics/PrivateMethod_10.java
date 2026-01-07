package basics;

import java.lang.reflect.Method;

public class PrivateMethod_10 {

	public static void main(String[] args) {
		
		Method[] methods = Analytics.class.getDeclaredMethods();
		
		System.out.println("Private Methods Count: " + methods.length);
		
	}

}


class Analytics {
	
	private void track() {
		
	}
	
	private void report() {
		
	}
}
