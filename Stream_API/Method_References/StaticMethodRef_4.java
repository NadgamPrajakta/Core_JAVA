package method_references;
import java.util.function.Function;

public class StaticMethodRef_4 {
	
    public static void main(String[] args) {
    	
        Function<String, Integer> f = StringUtils::length;
        
        System.out.println(f.apply("Java"));
    }
}


class StringUtils {
	
    static int length(String s) {
        return s.length();
    }
}