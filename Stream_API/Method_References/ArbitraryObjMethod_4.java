package method_references;
import java.util.function.Function;

public class ArbitraryObjMethod_4 {
	
    public static void main(String[] args) {
    	
        Function<BankAccount, Double> f = BankAccount::getBalance;
        
        System.out.println(f.apply(new BankAccount()));
    }
}


class BankAccount {
	
    double balance = 15000;
    
    double getBalance() 
    {
        return balance;
    }
}