package basics;

public class ATMSyncDemo {
    public static void main(String[] args) {
    	ATM_2 atm = new ATM_2();

        new ATMUser(atm, "User1").start();
        new ATMUser(atm, "User2").start();
    }
}

class ATM_2 {
    private int balance = 5000;

    synchronized void withdraw(String user, int amount) {
        if (balance >= amount) {
            System.out.println(user + " withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + user);
        }
    }
}

class ATMUser extends Thread {
	ATM_2 atm;
    String name;

    ATMUser(ATM_2 atm, String name) {
        this.atm = atm;
        this.name = name;
    }

    public void run() {
        atm.withdraw(name, 3000);
    }
}


