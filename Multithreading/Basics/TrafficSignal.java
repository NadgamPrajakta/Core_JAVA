package basics;

class TrafficSignal extends Thread {
    public void run() {
        try {
            System.out.println("RED - Stop");
            Thread.sleep(3000);

            System.out.println("YELLOW - Ready");
            Thread.sleep(2000);

            System.out.println("GREEN - Go");
        } catch (InterruptedException e) {}
    }

    public static void main(String[] args) {
        TrafficSignal signal = new TrafficSignal();
        signal.start();
    }
}
