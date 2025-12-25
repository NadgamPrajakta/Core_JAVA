package method_references;
import java.util.function.Function;

public class StaticMethodRef_3 {
	
    public static void main(String[] args) {
    	
        Function<Integer, Integer> f = MathUtils::square;
        
        System.out.println(f.apply(5));
    }
}


class MathUtils {
	
    static int square(int x) {
        return x * x;
    }
}