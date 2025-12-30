package basics;

public class MultiLockDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        new BankUser(acc).start();
        new BankUser(acc).start();
    }
}

class Account {
    private int balance = 1000;
    private final Object depositLock = new Object();
    private final Object withdrawLock = new Object();

    void deposit(int amount) {
        synchronized (depositLock) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    void withdraw(int amount) {
        synchronized (withdrawLock) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    int getBalance() {
        return balance;
    }
}

class BankUser extends Thread {
    Account acc;

    BankUser(Account acc) {
        this.acc = acc;
    }

    public void run() {
        acc.deposit(500);
        acc.withdraw(300);
    }
}

