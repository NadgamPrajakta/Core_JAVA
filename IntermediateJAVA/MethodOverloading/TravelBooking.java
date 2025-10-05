package MethodOverloading;

public class TravelBooking {

    // Book by destination only
    public void bookTicket(String destination) {
        System.out.println("Ticket booked to " + destination);
    }

    // Book by destination and date
    public void bookTicket(String destination, String date) {
        System.out.println("Ticket booked to " + destination + " on " + date);
    }

    // Book by destination, date, and passenger name
    public void bookTicket(String destination, String date, String passengerName) {
        System.out.println("Ticket booked for " + passengerName + " to " + destination + " on " + date);
    }

    public static void main(String[] args) {
        TravelBooking booking = new TravelBooking();

        booking.bookTicket("Goa");
        booking.bookTicket("Delhi", "15-Oct-2025");
        booking.bookTicket("Mumbai", "20-Oct-2025", "Prajkta Nadgam");
    }
}
