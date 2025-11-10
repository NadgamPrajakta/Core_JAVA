package aggregation;

public class Fifth_5 {

	public static void main(String[] args) {
		
		Account a = new Account(123456);
		
		Bank b = new Bank(a);
		
		b.showAccount();

	}

}


class Account {
	private int accNo;
	
	public Account(int accNo) {
		
		this.accNo = accNo;
	}
	
	public int getAccNo() {
		return accNo;
	}
}


class Bank {
	private Account account;
	
	public Bank(Account account) {
		
		this.account = account;
	}
	
	public void showAccount() {
		
		try {
			if(account == null) 
				
				throw new Exception("No Account Linked..!");
			
			System.out.println("Bank managing account: " + account.getAccNo());
		}
		
		catch(Exception ex) {
			
			System.out.println(ex.getMessage());
		}
	}
}
