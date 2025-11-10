package propagationofexception;

public class MainApp {
    public static void main(String[] args) {
    	
    	GooglePay.checkBalance();
    	
    	GooglePay.sendMoney(20000, 1234);
    	GooglePay.sendMoney(8000, 1234);
    	GooglePay.sendMoney(-100, 1234);
    	GooglePay.sendMoney(1000, 1111);
    	
    	System.out.println("Thank you for using Google Pay..!");

    }
}


class GooglePay {
	
	static String user = "Prajkta";
	static double balance = 50000;
	static int upiPin = 200403;
	
	public static void checkBalance() {
		
		System.out.println("Current Balance:" + balance);
		
	}
	
	public static void sendMoney(double amount, int pin) {
		
		try {
			
			if(user == null) {
				
				throw new AccountNotFoundException("Account not found!", new Throwable("User is null"), 101);
			
		}
			
		}
			
		catch(AccountNotFoundException ex) {
			
			System.out.println("Error:" + ex.getMessage() + " | Code:" + ex.getCode());
			System.out.println("Cause:" + ex.getCause());
			
		}
		
		
		try {
			
			if(pin != upiPin) {
				
				throw new InvalidPinException("Invalid UPI Pin.!", new Throwable("Wrong Pin entered"), 102);
			}
		}
		
		catch(InvalidPinException ex) {
			
			System.out.println("Error:" + ex.getMessage() + " | Code:" + ex.getCode());
			System.out.println("Cause:" + ex.getCause());
			
		}
		
		
		try {
			
			if(amount <= 0) {
				
				throw new InvalidAmountException("Invalid amount entered.!", new Throwable("Zero or negative amount"), 100);
			}
		}
		
		catch(InvalidAmountException ex) {
			
			System.out.println("Error:" + ex.getMessage() + " | Code:" + ex.getCode());
			System.out.println("Cause:" + ex.getCause());
		
		}
		
		
		try {
			
			if(amount > balance) {
				
				throw new InsufficientBalanceException("Insufficient balance.!", new Throwable("Not enough funds"), 200);
			}
		}
		
		catch(InsufficientBalanceException ex) {
			
			System.out.println("Error:" + ex.getMessage() + " | Code:" + ex.getCode());
			System.out.println("Cause:" + ex.getCause());
			
			
		}
		
		
		balance -= amount;
		System.out.println(" Payment of " + amount + " Successfully..!");
		checkBalance();
	}
	
}

