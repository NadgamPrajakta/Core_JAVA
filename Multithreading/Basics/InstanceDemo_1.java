package basics;

class TicketBooking {
    private int seats = 5;

    synchronized void bookSeat(String name) {
        if (seats > 0) {
            System.out.println(name + " booked a seat");
            seats--;
            System.out.println("Seats left: " + seats);
        } else {
            System.out.println("No seats available for " + name);
        }
    }
}

public class InstanceDemo_1 {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        new User(booking, "A").start();
        new User(booking, "B").start();
        new User(booking, "C").start();
    }
}

class User extends Thread {
    TicketBooking booking;
    String name;

    User(TicketBooking booking, String name) {
        this.booking = booking;
        this.name = name;
    }

    public void run() {
        booking.bookSeat(name);
    }
}


