package basics;

import java.lang.reflect.Field;

public class PrivateField_2 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Account a = new Account();
		
		Field f = Account.class.getDeclaredField("balance");
		
		f.setAccessible(true);
		
		f.set(a, 10000);
		
		System.out.println("Updated Balance: " + f.get(a));

	}

}


class Account {
	
	private double balance = 5000;
}