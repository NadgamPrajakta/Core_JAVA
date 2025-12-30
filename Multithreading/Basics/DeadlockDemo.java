package basics;

class Resource_20 {}

public class DeadlockDemo {
    static Resource_20 r1 = new Resource_20();
    static Resource_20 r2 = new Resource_20();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println("Thread 1 locked r1");
                synchronized (r2) {
                    System.out.println("Thread 1 locked r2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("Thread 2 locked r2");
                synchronized (r1) {
                    System.out.println("Thread 2 locked r1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
