package basics;

public class RaceConditionDemo {
	
    public static void main(String[] args) throws Exception {
    	
        UnsafeCounter c = new UnsafeCounter();

        CounterThread t1 = new CounterThread(c);
        CounterThread t2 = new CounterThread(c);

        t1.start(); 
        t2.start();
        t1.join(); 
        t2.join();

        System.out.println("Final Count: " + c.count);
    }
}

class UnsafeCounter {
    int count = 0;

    void increment() {
        count++;
    }
}

class CounterThread extends Thread {
    UnsafeCounter c;

    CounterThread(UnsafeCounter c) {
        this.c = c;
    }

    public void run() {
        for(int i = 0; i < 1000; i++)
            c.increment();
    }
}

