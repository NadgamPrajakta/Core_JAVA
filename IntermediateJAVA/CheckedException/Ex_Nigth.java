package CheckedException;

import java.io.EOFException;

public class Ex_Nigth {

	public static void main(String[] args) {
		
		try {
			int bytesRead = -1;
			if(bytesRead == -1) {
				
				throw new EOFException("Reached end of file unexpectedly");
			}
		}
		
		catch (EOFException e) {
			System.out.println("Caugth:" + e.getMessage());
		}
		
		finally {
			System.out.println("File reading process completed.");
		}

	}

}
