package method_references;

import java.util.function.Predicate;

public class StaticMethodRef_7 {
	
    public static void main(String[] args) {
    	
        Predicate<Integer> p = Check::isPositive;
        
        System.out.println(p.test(-5));
    }
}


class Check {
	
    static boolean isPositive(int x) {
        return x > 0;
    }
}
