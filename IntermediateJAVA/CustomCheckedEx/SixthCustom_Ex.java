package CustomCheckedEx;

public class SixthCustom_Ex {

	public static void main(String[] args) {
		
		try {
			boolean connected = false;
			if(!connected) {
				
				throw new NetworkFailureException();
			}
			
			System.out.println("Connected to network");
		}
		
		catch(NetworkFailureException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Network check complete..!");
		}
	}

}

class NetworkFailureException extends Exception{
	
	public NetworkFailureException() {
		
		super("Network connection failed..!");
	}
}
