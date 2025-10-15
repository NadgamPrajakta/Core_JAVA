package CustomUncheckedEx;

public class NineteenCusUnchecked {

	public static void main(String[] args) {
		
		try {
			boolean payment = false;
			if(!payment) {
				
				throw new PaymentFailedRuntimeException();
			}
			
			System.out.println("Payment successfull.");
		}
		
		catch(PaymentFailedRuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Payment process done...!");
		}
	}

}

class PaymentFailedRuntimeException extends RuntimeException {
	
	public PaymentFailedRuntimeException() {
		
		super("Payment failed..!");
	}
}
