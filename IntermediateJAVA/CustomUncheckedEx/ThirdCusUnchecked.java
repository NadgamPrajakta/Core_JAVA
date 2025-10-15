package CustomUncheckedEx;

public class ThirdCusUnchecked {

	public static void main(String[] args) {
		
		try {
			int a = 10; 
			int b = 0;
			if(b == 0) {
				
				throw new DivideByZeroRuntimeException("Cannot divide by zero..!");
			}
			
			System.out.println("Result:" + (a/b));
			
		}
		
		catch(DivideByZeroRuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Division attempt finished..!");
		}
	}

}

class DivideByZeroRuntimeException extends Exception {
	
	public DivideByZeroRuntimeException(String str) {
		
		super(str);
	}
}
