package basics;

public class StaticDemo_3 {
	
    public static void main(String[] args) {
    	
        new InterestThread().start();
        new InterestThread().start();
    }
}

class Bank {
    static int balance = 1000;

    static synchronized void addInterest(int amount) {
        balance += amount;
        System.out.println("Balance: " + balance);
    }
}

class InterestThread extends Thread {
    public void run() {
        Bank.addInterest(100);
    }
}
