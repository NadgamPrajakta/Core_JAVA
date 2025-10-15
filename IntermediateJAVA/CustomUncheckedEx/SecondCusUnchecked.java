package CustomUncheckedEx;

public class SecondCusUnchecked {

	public static void main(String[] args) {
		
		try {
			String data = null;
			if(data == null) {
				
				throw new NullDataRuntimeException("Data cannot be null..!");
			}
			
//			System.out.println("Data processed..");
		}
		
		catch(NullDataRuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Data process complete..!");
		}

	}

}

class NullDataRuntimeException extends RuntimeException {
	
	public NullDataRuntimeException(String str) {
		
		super(str);
	}
}
