package Static;

public class BankAccount_1 {
    // Static variable - shared by all accounts
    static String bankName = "State Bank of India";

    // Non-static variables - unique for each account
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount_1(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Non-static method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolder + " deposited ₹" + amount + ". New balance: ₹" + balance);
    }

    // Non-static method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew ₹" + amount + ". Remaining balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Static method
    public static void changeBankName(String newBankName) {
        bankName = newBankName;
    }

    // Display details
    public void displayDetails() {
        System.out.println("Bank: " + bankName + ", Account Holder: " + accountHolder + ", Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount_1 acc1 = new BankAccount_1("Prajkta", 50000);
        BankAccount_1 acc2 = new BankAccount_1("Sneha", 30000);

        acc1.deposit(2000);
        acc2.withdraw(5000);

        System.out.println("\n--- Before Changing Bank Name ---");
        acc1.displayDetails();
        acc2.displayDetails();

        System.out.println("\n--- Changing Bank Name (Static) ---");
        BankAccount_1.changeBankName("HDFC Bank");

        acc1.displayDetails();
        acc2.displayDetails();
    }
}
