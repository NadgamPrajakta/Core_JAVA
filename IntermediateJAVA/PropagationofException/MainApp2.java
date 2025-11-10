package propagationofexception;

public class MainApp2 {

	public static void main(String[] args) {
		
		MobileShop.showStock();
		
		MobileShop.buyMobile("Redmi 13c 5G", 45000);
		MobileShop.buyMobile("iPhone 15", 50000);
		MobileShop.buyMobile("Redmi 13c 5G", -5000);
		MobileShop.buyMobile("Redmi 13c 5G", 30000);
		
		

	}

}


class MobileShop {
	
	static String availableModel = "Redmi 13c 5G";
	static int stock = 5;
	static boolean warrantyAvailable = true;
	
	public static void showStock() {
		System.out.println("Current stock: " + stock + " | Model: " + availableModel);
	}
	
	public static void buyMobile(String model, double paymentAccount) {
		
		try {
			
			if(!model.equalsIgnoreCase(availableModel)) {
				
				throw new InvalidModelException("Invalid mobile model..!", 101, new Throwable("Model not found"));
			}
		}
		
		catch(InvalidModelException ex) {
			
			System.out.println("Error: " + ex.getMessage() + " | Code: " + ex.getcode());
			System.out.println("Cause: " + ex.getCause());
		}
		
		
		try {
			
			if(stock <= 0) {
				
				throw new OutOfStockException("Mobile is ut of stock..!", 102, new Throwable("No stock left"));
			}
		}
		
		catch(OutOfStockException ex) {
			
			System.out.println("Error: " + ex.getMessage() + " | Code: " +ex.getcode());
			return;
		}
		
		
		try {
			
			int paymentAmount = 0;
			if(paymentAmount <= 0) {
			
				throw new InvalidPaymentException("Invalid paymanet amount..!", 103, new Throwable("Payment shpuld be positive"));
			}
		}
		
		catch(InvalidPaymentException ex) {
			System.out.println("Error: " + ex.getMessage() + " | Code: " + ex.getcode());
			return;
		}
		
		
		try {
			
			if(!warrantyAvailable) {
				
				throw new WarrantyExpiredException("Warranty has expired..!", 104, new Throwable("Warranty invalid"));
				
			}
		}
		
		catch(WarrantyExpiredException ex) {
			System.out.println("Error: " + ex.getMessage() + " | Code: " + ex.getCode());
			return;
		}
		
		
		stock --;
		
		System.out.println("Purchase Successfully..!");
		System.out.println("Model: " + model);
		String paymentAmount = null;
		System.out.println("Payment: " + paymentAmount);
		showStock();
		
		
	}
}
