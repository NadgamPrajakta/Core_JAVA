package CustomUncheckedEx;

public class FourthCusUnchecked {

	public static void main(String[] args) {
		
		try {
			boolean hasAccess = false;
			if(!hasAccess) {
				
				throw new UnauthorizedAccessRuntimeException("Access Denied..!");
			}
			
			System.out.println("Access Granted..");
		}
		
		catch(UnauthorizedAccessRuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Access check finished..!");
		}
	}

}

class UnauthorizedAccessRuntimeException extends RuntimeException {
	
	public UnauthorizedAccessRuntimeException(String str) {
		
		super(str);
	}
}
