package CheckedException;

import java.io.IOException;

public class Ex_First {

	public static void main(String[] args) {


		try {
			String fileName = "";
			if(fileName.isEmpty()) {
				throw new IOException ("File name cannot be empty");
			}
		}
		catch(IOException e) {
			System.out.println("Caugth:" + e.getMessage());
		}
		finally {
			System.out.println("Completed file validation.");
		}

	}

}
