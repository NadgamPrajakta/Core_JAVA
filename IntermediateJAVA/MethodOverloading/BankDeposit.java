package MethodOverloading;

public class BankDeposit {

    // Deposit using cash
    public void deposit(double amount) {
        System.out.println("Deposited ₹" + amount + " in cash.");
    }

    // Deposit using cheque
    public void deposit(String chequeNumber, double amount) {
        System.out.println("Deposited ₹" + amount + " using cheque no: " + chequeNumber);
    }

    // Deposit using UPI
    public void deposit(double amount, String upiId) {
        System.out.println("Deposited ₹" + amount + " using UPI ID: " + upiId);
    }

    public static void main(String[] args) {
        BankDeposit account = new BankDeposit();

        account.deposit(5000);
        account.deposit("CHK1023", 12000);
        account.deposit(2000, "prajkta@ybl");
    }
}
