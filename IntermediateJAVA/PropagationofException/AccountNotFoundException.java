package propagationofexception;


public class AccountNotFoundException extends Exception {
	
	int code;
	
	public AccountNotFoundException(String str, Throwable t, int i) {
		
		super(str, t);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}

}


class InvalidPinException extends Exception {
	
	int code;
	
	public InvalidPinException(String str, Throwable t, int i) {
		
		super(str, t);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
}


class InsufficientBalanceException extends Exception {
	
	int code;
	
	public InsufficientBalanceException(String str, Throwable t, int i) {
		
		super(str, t);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
}


class InvalidAmountException extends Exception {
	
	int code;
	
	public InvalidAmountException(String str, Throwable t, int i) {
		
		super(str, t);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
}


