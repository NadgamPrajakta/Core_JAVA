package CustomCheckedEx;

public class FirstCustom_Ex {

	public static void main(String[] args) {
		
		try {
			int age = -5;
			if(age < 0) {
				
				throw new InvalidAgeException("Age cannot be negative");
			}
			
			System.out.println("Age: " + age);
		}
			catch(InvalidAgeException ex) {
				
				System.out.println(ex.getMessage());
				
			}
		finally {
			
			System.out.println("Age check finished...");
		}
		
		}
}

class InvalidAgeException extends Exception {
	 
	public InvalidAgeException(String msg) {
		
		super(msg);
	}
}