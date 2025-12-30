package basics;

class BankAccount {
    private int balance = 10000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() +
                               " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " +
                               Thread.currentThread().getName());
        }
    }

   public static void main(String[] args) {
    BankAccount acc = new BankAccount();

    ATM user1 = new ATM(acc, 7000);
    ATM user2 = new ATM(acc, 7000);

    user1.setName("User-1");
    user2.setName("User-2");

    user1.start();
    user2.start();
}

}

class ATM extends Thread {
    BankAccount account;
    int amount;

    ATM(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}
