package USS.Com;
import java.io.*;

// custom Exception class
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class ExceptionHandlingAllKeywords {
	
	// Method that declares exception using 'throws'
	static void validateAge(int age) throws InvalidAgeException{
		if (age < 18) {    //  Explicitly throwing exception using 'throw'
			
			throw new InvalidAgeException("Age must be 18 or above to register.");
		}
		
		else {
			System.out.println("Age validated: you are eligible to rgister.");
		}
	}
	
	// Method that reads a file (example for checked exception with throws)
	
	static void readFile() throws IOException{
		FileReader file = new FileReader("test.txt");      // My throw fileNotFoundException
		
		BufferedReader br = new BufferedReader(file);
		System.out.println("File content:"+ br.readLine());
		br.close();
	}

	public static void main(String[] args) throws IOException {
		
		try {                     // Try block for age validation
			
			validateAge(15);     // This will throw InvalidAgeException  // Try block for file handling
			readFile();         // This may throw IOException if file not found 
		}
		catch(InvalidAgeException e) {
			System.out.println("caught custom exception:"+e.getMessage());
		}
		catch(IOException e) {
			System.out.println("caugth IOException e");
			
		}
		catch(Exception e) {   // Catching any other general exceptions
			System.out.println("caugth general exception:"+e);
		}
		finally {       // This block always executed
			
			System.out.println("Finally block executed: cleaning up resources...");
		}
		 
		System.out.println("Program continues normally after exception handling...");
	}

}
