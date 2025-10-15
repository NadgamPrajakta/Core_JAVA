package CustomUncheckedEx;

public class SixCusUnchecked {

	public static void main(String[] args) {
		
		try {
			boolean success = false;
			if(!success) {
				
				throw new OperationFailedRuntimeException();
			}
			
			System.out.println("Operation succesfully.");
		}
		
		catch(OperationFailedRuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Operation finished..!");
		}
	}

}

class OperationFailedRuntimeException extends RuntimeException {
	
	public OperationFailedRuntimeException() {
		
		super("Operation failed..!");
	}
}
