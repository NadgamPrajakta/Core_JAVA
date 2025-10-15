package CustomCheckedEx;

public class SecondCustom_Ex {

	public static void main(String[] args) {
		
		try {
			String email = "smartpn.ai20a2gmail.com";
			
			if (!email.contains("@")) {
				
				throw new InvalidEmailException("Invalid Email");
			}
			
			System.out.println("Email is valid..");
			
		}
			 
			catch(InvalidEmailException ex) {
				System.out.println(ex.getMessage());
			}
			
			finally {
				System.out.println("Email Validation Complted..");
			}
	}

}

class InvalidEmailException extends Exception {
	
	public InvalidEmailException(String msg) {
		
		super(msg);
	}
}
