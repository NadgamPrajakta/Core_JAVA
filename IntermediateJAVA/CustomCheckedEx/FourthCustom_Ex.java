package CustomCheckedEx;

public class FourthCustom_Ex {

	public static void main(String[] args) {
		
		try {
			double balance = 200;
			double withdraw = 500;
			
			if(withdraw > balance) {
				
				throw new InsufficientBalanceException("Insufficient balance..!");
				
			}
			
			System.out.println("Withdrawl successfull...");
		}
		catch(InsufficientBalanceException ex) {
			
			System.out.println(ex.getMessage());
		}
		
		finally {
			
			System.out.println("Transaction complete..");
		}

	}

}

class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException(String str) {
		
		super(str);
	}
}
