package Functional_Interface;

public class ThreadEx {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Running in a thread!");
        Thread t = new Thread(task);
        t.start();
    }
}
