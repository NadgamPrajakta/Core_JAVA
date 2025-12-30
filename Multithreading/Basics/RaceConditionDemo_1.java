package basics;

public class RaceConditionDemo_1 {
	
    public static void main(String[] args) throws Exception {
    	
    	SafeCounter c = new SafeCounter();

    	CounterThread_1 t1 = new CounterThread_1(c);
    	CounterThread_1 t2 = new CounterThread_1(c);

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Final Count: " + c.count);
    }
}


class SafeCounter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}


class CounterThread_1 extends Thread {
	SafeCounter c;

	CounterThread_1(SafeCounter c) {
        this.c = c;
    }

    public void run() {
        for(int i = 0; i < 1000; i++)
            c.increment();
    }
}
