package CheckedException;

public class Ex_Seventh {

	public static void main(String[] args) {
		
		try {
			String method = "";
			if(method.isEmpty()) {
				
				throw new NoSuchMethodException("Method name not provided");
			}
		}
		
		catch (NoSuchMethodException e) {
			System.out.println("Caugth:" + e.getMessage());
		}
		
		finally {
			System.out.println("Method validation done.");
		}
	}

}
