package CustomUncheckedEx;

public class EighteenCusUnchecked {

	public static void main(String[] args) {
		
		try {
			String state = null;
			if(state == null) {
				
				throw new InvalidStateRuntimeException();
			}
			
//			System.out.println("State Ok.");
		}
		
		catch(InvalidStateRuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("State check complete...!");
		}
	}

}

class InvalidStateRuntimeException extends RuntimeException {
	
	public InvalidStateRuntimeException() {
		
		super("Invalid state detected..!");
	}
}
