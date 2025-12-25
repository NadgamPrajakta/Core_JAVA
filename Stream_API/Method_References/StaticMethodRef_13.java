package method_references;
import java.util.function.Function;

public class StaticMethodRef_13 {
	
    public static void main(String[] args) {
    	
        Function<Integer, String> f = ConvertUtils::toString;
        
        System.out.println(f.apply(50));
    }
}


class ConvertUtils {
	
    static String toString(int x) {
        return String.valueOf(x);
    }
}
