package basics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethod_5 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		
		OrderService o = new OrderService();
		
		Method m = OrderService.class.getDeclaredMethod("createOrder");
		
		m.setAccessible(true);
		
		String result =  (String) m.invoke(o);
		
		System.out.println(result);

	}

}


class OrderService {
	
	private String createOrder() {
		
		return "Order Crated successfully";
	}
}