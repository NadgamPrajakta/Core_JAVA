package CustomCheckedEx;

public class TenthCustom_Ex {

	public static void main(String[] args) {
		
		try {
			int orderId = 0;
			if(orderId <= 0) {
				
				throw new OrderProcessingException();
			}
			
			System.out.println("Order processed succesfully..");
		}
		
		catch(OrderProcessingException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Order process complete..!");
		}
	}

}

class OrderProcessingException extends Exception{
	
	public OrderProcessingException() {
		
		super("Invalid order ID..!");
	}
}
