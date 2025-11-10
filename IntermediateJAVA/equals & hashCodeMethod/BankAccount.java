package equalsMethod;

import java.util.Objects;

public class BankAccount {
	
	String accountNumber;
	String holderName;
	double balance;
	
	BankAccount(String accountNumber, String holderName, double balance) {
		
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(!(obj instanceof BankAccount)) return false;
		
		BankAccount a = (BankAccount) obj;
		
		return accountNumber.equals(a.accountNumber);
	}
	
	public int hashCode() {
		return Objects.hash(accountNumber);
	}

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("12345", "Prajkta", 10000);
		BankAccount b2 = new BankAccount("12345", "Prajkta", 20000);
		
		System.out.println(b1.equals(b2));

	}

}
