package CheckedException;

public class Ex_Fifth {

	public static void main(String[] args) {
		
		try {
			boolean stopThread = true;
			if(stopThread) {
				
				throw new InterruptedException("Thread was manually interrupted");
			}
		}
		catch (InterruptedException e) {
			System.out.println("Caugth:" + e.getMessage());
		}
		finally {
			System.out.println("Thread operation completed.");
		}
	}

}
