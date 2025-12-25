package method_references;
import java.util.function.Function;

public class StaticMethodRef_5 {
	
    public static void main(String[] args) {
    	
        Function<String, String> f = TextUtils::toUpper;
        
        System.out.println(f.apply("ai"));
    }
}


class TextUtils {
	
    static String toUpper(String s) {
        return s.toUpperCase();
    }
}
