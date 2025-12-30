package basics;

public class BlockDemo_2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        new Worker(counter).start();
        new Worker(counter).start();
    }
}


class Counter {
    private int count = 0;
    private final Object lock = new Object();

    void increment() {
        System.out.println(Thread.currentThread().getName() + " started");

        synchronized (lock) {
            count++;
            System.out.println("Count: " + count);
        }
    }
}

class Worker extends Thread {
    Counter counter;

    Worker(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        counter.increment();
    }
}
