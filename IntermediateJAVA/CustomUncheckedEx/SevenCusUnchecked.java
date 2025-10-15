package CustomUncheckedEx;

public class SevenCusUnchecked {

	public static void main(String[] args) {
		
		try {
			int a = Integer.MAX_VALUE;
			if(a + 1 < 0) {
				
				throw new DataOverflowRuntimeException();
			}
			
			System.out.println("Computation valid..");
		}
		
		catch(DataOverflowRuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Computation check done.");
		}
	}

}

class DataOverflowRuntimeException extends RuntimeException {
	
	public DataOverflowRuntimeException() {
		
		super("Integer overflow occurred..!");
	}
}
