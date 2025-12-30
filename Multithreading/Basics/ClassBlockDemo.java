package basics;

public class ClassBlockDemo {
	
    public static void main(String[] args) {
    	
        new LogThread().start();
        new LogThread().start();
    }
}

class Logger {
    static void log(String msg) {
        synchronized (Logger.class) {
            System.out.println(msg);
        }
    }
}

class LogThread extends Thread {
    public void run() {
        Logger.log("Logging from " + Thread.currentThread().getName());
    }
}


