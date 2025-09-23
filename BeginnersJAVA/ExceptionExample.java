package USS.Com;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int result = a / b;   //Arithmetic Exception
			
			System.out.println("Result:"+result);
		
		}
		catch(ArithmeticException e){
			System.out.println("Error:Division by zero is not allowed");
			
		}
		System.out.println("Program continues...");
		
	}

}
