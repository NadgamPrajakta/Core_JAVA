package method_references;

import java.util.function.Function;

public class ConstructorRef_7 {
	
    public static void main(String[] args) {
    	
        Function<Double, Account_2> f = Account_2::new;
        System.out.println(f.apply(5000.0).balance);
    }
}


class Account_2 {
	
    double balance;
    
    Account_2(double balance)
    {
        this.balance = balance;
    }
}
