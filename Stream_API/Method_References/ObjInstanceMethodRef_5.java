package method_references;
import java.util.function.Supplier;

public class ObjInstanceMethodRef_5 {
	
    public static void main(String[] args) {
    	
        Account a = new Account();
        
        Supplier<Double> s = a::getBalance;
        System.out.println(s.get());
    }
}


class Account {
	
    double balance = 8000;
    double getBalance() 
    
    {
        return balance;
    }
}