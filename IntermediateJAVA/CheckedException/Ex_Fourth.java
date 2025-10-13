package CheckedException;

public class Ex_Fourth {

	public static void main(String[] args) {
		
		try {
			String className = null;
			if(className == null) {
				
				throw new ClassNotFoundException("Class name cannot be null");
			}
		}
		catch(ClassNotFoundException e) {
			System.out.println("Caught:" + e.getMessage());
		}
		finally {
			System.out.println("Class validation completed.");
		}
	}

}
