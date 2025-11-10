package propagationofexception;

public class MainApp3 {

	public static void main(String[] args) {
	
		MovieTicket.showStatus();
		
		MovieTicket.bookTicket("Avengers: Endgame", 20, 300);
		
		MovieTicket.bookTicket("Avatar 2", 25, 300);
		
		MovieTicket.bookTicket("Avengers: Endgame", 10, 300);
		
		MovieTicket.bookTicket("Avengers: Endgame", 18, 300);
		
		MovieTicket.bookTicket("Avengers: Endgame", 22, 350);
		
		System.out.println("Thank you for booking with MovieTicket..!");
		
		

	}

}


class MovieTicket {
	
	static String availableMovie = "Avengers: Endgame";
	static int totalSeats = 5;
	static int ageLimit = 13;
	static double ticketPrice = 300;
	
	public static void showStatus() {

		System.out.println("Movie: " + availableMovie + " | Seats Left: " + totalSeats);
	}
	
	public static void bookTicket(String movieName, int age, double payment) {
		
		try {
		
		if(!movieName.equalsIgnoreCase(availableMovie)) {
			
			throw new InvalidMovieException("Invalid Movie Selected..!", 101, new Throwable("Movie not listed."));
		}
	}
	
	catch(InvalidMovieException ex) {
		
		System.out.println("Error: " + ex.getMessage() + " | Code: " + ex.getCode());
		System.out.println("Cause: " + ex.getCause());
		return;
	}
		
		try {
			
			if(totalSeats <= 0) {
				
				throw new SeatNotAvailableException("No seats available..!", 102, new Throwable("House full."));
			}
		}
		
		catch(SeatNotAvailableException ex) {
			
			System.out.println("Error: " + ex.getMessage() + " | Code: " + ex.getCode());
			System.out.println("Cause: " + ex.getCause());
			return;
		}
		
		
		try { 
			
			if( age < ageLimit) {
				
				throw new AgeRestrictionException("You are too young for this movie..!", 103, new Throwable("age below limit."));
			}
		}
		
		catch(AgeRestrictionException ex) {
			
			System.out.println("Error: " + ex.getMessage() + " | Code: " + ex.getCode());
			System.out.println("Cause: " + ex.getCause());
			return;
		}
		
		
//		try {
//			
//			if(payment < ticketPrice) {
//				
//				throw new InvalidPaymentException("Insufficient payment..!", 104, new Throwable("Payment too low."));
//			}
//		}
//		
//		catch(InvalidPaymentException ex) {
//			
//			System.out.println("Error: " + ex.getMessage() + " | Code: " + ex.getCode());
//			System.out.println("Cause: " + ex.getCause());
//			return;
//		}
		
		
		try {
			
			if(Math.random() < 0.2) {
				
				throw new NetworkErrorException("Network error! Try again later..!", 105, new Throwable("Connection lost"));
			}
		}
		
		catch(NetworkErrorException ex) {
			
			System.out.println("Error: " + ex.getMessage() + " | Code: " + ex.getCode());
			System.out.println("Cause: " + ex.getCause());
			return;
		}
		
		totalSeats--;
		
		System.out.println("Ticket booked successfully for " + movieName + " ! ");
		
		System.out.println("Age: " + age + " | Payment: " + payment);
		
		showStatus();
		
}
	
}