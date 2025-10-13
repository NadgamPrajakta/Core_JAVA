package CheckedException;

import java.io.File;
import java.io.FileNotFoundException;

public class Ex_Second {

	public static void main(String[] args) {


		try {
			File file = new File("Missing.txt");
			
			if(!file.exists()) {
				throw new FileNotFoundException("File not found:" + file.getName());
				
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Caugth:" + e.getMessage());
			
		}
		finally {
			System.out.println("File existence checked.");
		}
	}

}
