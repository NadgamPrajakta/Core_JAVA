package basics;

import java.lang.reflect.Constructor;

public class PrivateCtors_2 {

	public static void main(String[] args) {
		
		Constructor<?>[] constructors = Sample.class.getDeclaredConstructors();
		
		for(Constructor<?> c : constructors) {
			
			System.out.println(c);
		}
	}

}


class Sample {
	
	private Sample() {
	
	}
	
	public Sample(int a , int b) {
		
	}
	
	public Sample(int j) {
		
	}
}