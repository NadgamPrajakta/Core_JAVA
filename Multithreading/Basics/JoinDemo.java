package basics;

public class JoinDemo {
	
    public static void main(String[] args) throws Exception {
    	
        Order order = new Order();
        Payment payment = new Payment();

        order.start();
        order.join(); // wait for order
        payment.start();
    }
}


class Order extends Thread {
    public void run() {
        System.out.println("Order placed");
        try { Thread.sleep(1000); } catch (Exception e) {}
    }
}

class Payment extends Thread {
    public void run() {
        System.out.println("Payment completed");
    }
}

