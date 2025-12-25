package method_references;
import java.util.function.Predicate;

public class StaticMethodRef_6 {
	
    public static void main(String[] args) {
    	
        Predicate<Integer> p = NumberCheck::isEven;
        
        System.out.println(p.test(10));
    }
}


class NumberCheck {
	
    static boolean isEven(int x) {
        return x % 2 == 0;
    }
}
