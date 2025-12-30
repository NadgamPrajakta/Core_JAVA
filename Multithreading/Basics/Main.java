package basics;

class Restaurant {
    boolean orderPlaced = false;

    synchronized void placeOrder() {
        System.out.println("Customer placed order");
        orderPlaced = true;
        notify();
    }

    synchronized void prepareFood() {
        while (!orderPlaced) {
            try {
                wait();
            } catch (Exception e) {}
        }
        System.out.println("Chef is preparing food");
    }
}

class Customer extends Thread {
    Restaurant r;
    Customer(Restaurant r) { this.r = r; }
    public void run() { r.placeOrder(); }
}

class Chef extends Thread {
    Restaurant r;
    Chef(Restaurant r) { this.r = r; }
    public void run() { r.prepareFood(); }
}

public class Main {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        new Chef(r).start();
        new Customer(r).start();
    }
}
