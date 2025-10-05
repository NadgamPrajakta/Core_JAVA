package MethodOverriding;

class Booking {
    void bookTicket() {
        System.out.println("Booking a generic ticket...");
    }
}

class FlightBooking extends Booking {
    @Override
    void bookTicket() {
        System.out.println("Flight ticket booked successfully!");
    }
}

class TrainBooking extends Booking {
    @Override
    void bookTicket() {
        System.out.println("Train ticket booked successfully!");
    }
}

public class TravelSystem {
    public static void main(String[] args) {
        Booking b1 = new FlightBooking();
        Booking b2 = new TrainBooking();

        b1.bookTicket();
        b2.bookTicket();
    }
}
