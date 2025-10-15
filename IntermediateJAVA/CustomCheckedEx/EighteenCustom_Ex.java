package CustomCheckedEx;

public class EighteenCustom_Ex {

	public static void main(String[] args) {
		
		try {
			String password = "12345";
			if(password.length() < 8) {
				
				throw new InvalidPasswordException();
				
			}
		}
		
		catch(InvalidPasswordException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			
			System.out.println("Password validation complete..!");
		}

	}

}

class InvalidPasswordException extends Exception{
	
	public InvalidPasswordException() {
	
	super("Password too short..!");
}
}
