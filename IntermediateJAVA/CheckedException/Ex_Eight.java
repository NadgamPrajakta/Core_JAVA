package CheckedException;

public class Ex_Eight {

	public static void main(String[] args) {
	
		try {
			boolean isAbstract = true;
			if(isAbstract) {
				
				throw new InstantiationException ("Cannot instantiate abstract class");
				
			}
		}
		
		catch (InstantiationException e) {
			System.out.println("Caugth:" + e.getMessage());
		}
		
		finally {
			System.out.println("Instantiation check completed.");
		}
	}

}
