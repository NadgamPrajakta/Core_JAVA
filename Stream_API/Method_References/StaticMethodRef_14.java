package method_references;
import java.util.function.Function;

public class StaticMethodRef_14 {
	
    public static void main(String[] args) {
    	
        Function<String, String> f = ReverseUtil::reverse;
        
        System.out.println(f.apply("Java"));
    }
}


class ReverseUtil {
	
    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}