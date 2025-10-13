package CheckedException;

import java.util.concurrent.TimeoutException;

public class Ex_Tenth {

	public static void main(String[] args) {
		
		try {
			int waitTime = 10;
			if(waitTime > 5) {
				
				throw new TimeoutException("Process took to long");
			}
		}
		
		catch(TimeoutException e) {
			System.out.println("Caugth:" + e.getMessage());
		}
		
		finally {
			System.out.println("Operation time monitored.");
		}

	}

}
