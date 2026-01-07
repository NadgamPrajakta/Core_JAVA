package basics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethod_9 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException {
		
		Payment p = new Payment();
		
		Method m = Payment.class.getDeclaredMethod("process");
		
		m.setAccessible(true);
		
		try {
			m.invoke(p);
		}
		
		catch(InvocationTargetException ex) {
			
			System.out.println(ex.getCause().getMessage());
		}
	}

}


class Payment {
	
	private void process() throws Exception {
		
		throw new Exception("Payement Failed");
	}
}