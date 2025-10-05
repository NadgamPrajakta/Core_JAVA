package Ctor;

public class BankAccount {
    // Private variables
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Main method to test
    public static void main(String[] args) {
        // Create account using constructor
        BankAccount acc1 = new BankAccount("SB-1001", "Prajkta Nadgam", 50000);

        acc1.displayAccountDetails();

        System.out.println("\n--- After Transactions ---");
        acc1.deposit(5000);
        acc1.withdraw(12000);
        acc1.displayAccountDetails();

        // Update account details using setters
        System.out.println("\n--- After Updating Account Holder ---");
        acc1.setAccountHolderName("P. Nadgam");
        acc1.displayAccountDetails();
    }
}
