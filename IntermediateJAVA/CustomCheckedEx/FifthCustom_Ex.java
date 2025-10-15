package CustomCheckedEx;

public class FifthCustom_Ex {

	public static void main(String[] args) {
		
		try {
			String user = null;
			if(user == null) {
				
				throw new UserNotFoundException("User Not Found..!");
			}
			
			System.out.println("Welcome" + user);
		}
		
		catch(UserNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			
			System.out.println("User check finished..!");
		}
	}

}

class UserNotFoundException extends Exception{
	
	public UserNotFoundException(String str) {
		
		super(str);
	}
}