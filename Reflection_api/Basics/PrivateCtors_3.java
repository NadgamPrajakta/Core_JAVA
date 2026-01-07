package basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateCtors_3 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Constructor<Bank> c = Bank.class.getDeclaredConstructor();
		
		c.setAccessible(true);
		
		Bank b = c.newInstance();
		
		Method m = Bank.class.getDeclaredMethod("deposit", int.class);
		
		m.setAccessible(true);
		m.invoke(b, 3000);

	}

}


class Bank {
	
	private int balance = 2000;
	
	private Bank() {
		
	}
	
	private void deposit(int amount) {
		
		balance += amount;
		
		System.out.println("Balance:" + balance);
	}
}