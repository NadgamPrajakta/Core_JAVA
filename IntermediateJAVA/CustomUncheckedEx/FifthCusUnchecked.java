package CustomUncheckedEx;

public class FifthCusUnchecked {

	public static void main(String[] args) {
		
		try {
			String resource = null;
			if(resource == null) {
				
				throw new ResourseNotAvailableRuntimeException("Resourse unavailable..!");
				
			}
			
			System.out.println("Resourse ready..!");
		}
		
		catch(ResourseNotAvailableRuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Resource check done..");
		}
	}

}

class ResourseNotAvailableRuntimeException extends RuntimeException {
	
	public ResourseNotAvailableRuntimeException(String str) {
		
		super(str);
	}
}