package basics;

public class OddEvenDemo {
	
    public static void main(String[] args) {
    	
        NumberPrinter np = new NumberPrinter();

        new Thread(() -> {
            try { np.printOdd(); } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try { np.printEven(); } catch (Exception e) {}
        }).start();
    }
}

class NumberPrinter {
    int number = 1;
    int limit = 10;

    synchronized void printOdd() throws InterruptedException {
        while (number <= limit) {
            if (number % 2 == 0)
                wait();

            System.out.println("Odd: " + number++);
            notify();
        }
    }

    synchronized void printEven() throws InterruptedException {
        while (number <= limit) {
            if (number % 2 == 1)
                wait();

            System.out.println("Even: " + number++);
            notify();
        }
    }
}

