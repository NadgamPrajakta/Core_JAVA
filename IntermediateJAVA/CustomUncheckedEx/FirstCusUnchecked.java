package CustomUncheckedEx;

public class FirstCusUnchecked {

	public static void main(String[] args) {
		
		try {
			String input = "";
			if(input.isEmpty()) {
				
				throw new InvalidInputRuntimeException("Input cannot be empty..!");
			}
			
			System.out.println("Input valid..");
		}
		
		catch(InvalidInputRuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Input check done..!");
		}
	}

}

class InvalidInputRuntimeException extends RuntimeException{
	
	public InvalidInputRuntimeException(String str) {
		
		super(str);
	}
}
