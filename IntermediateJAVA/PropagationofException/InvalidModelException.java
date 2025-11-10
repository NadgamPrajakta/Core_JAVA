package propagationofexception;

public class InvalidModelException extends Exception {
	
	int code;
	
	public InvalidModelException(String str, int code, Throwable t) {
		
		super(str, t);
		this.code = code;
	}
	
	public int getcode() {
		return this.code;
	}

}


class OutOfStockException extends Exception {
	
	int code; 
	
	public OutOfStockException(String str, int code, Throwable t) {
		
		super(str, t);
		this.code = code;
	}
	
	public int getcode() {
		return this.code;
	}
}


class InvalidPaymentException extends Exception {
	
	int code;
	
	public InvalidPaymentException(String str, int code, Throwable t) {
		
		super(str, t);
		this.code = code;
	}
	
	public int getcode() {
		return this.code;
	}
}


class WarrantyExpiredException extends Exception {
	
	int code;
	
	public WarrantyExpiredException(String str, int code, Throwable t) {
		
		super(str, t);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
}
