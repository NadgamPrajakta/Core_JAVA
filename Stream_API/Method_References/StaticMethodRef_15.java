package method_references;
import java.util.function.Function;

public class StaticMethodRef_15 {
	
    public static void main(String[] args) {
    	
        Function<Integer, Double> f = MathUtil::sqrt;
        
        System.out.println(f.apply(16));
    }
}


class MathUtil {
	
    static double sqrt(int x) {
        return Math.sqrt(x);
    }
}
