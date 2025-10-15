package CustomCheckedEx;

public class SevenCustom_Ex {

	public static void main(String[] args) {
		
		try {
			boolean dbConnected = false;
			if(!dbConnected) {
				
				throw new DatabaseConnectionException();
			}
			
			System.out.println("Database connected..");
		}
		
		catch(DatabaseConnectionException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Database connection attepmt finished..");
		}

	}

}

class DatabaseConnectionException extends Exception{
	
	public DatabaseConnectionException() {
		
		super("Failed to connect to Database..!");
	}
}
