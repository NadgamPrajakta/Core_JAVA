package method_references;
import java.util.function.BiFunction;

public class StaticMethodRef_12 {
	
    public static void main(String[] args) {
    	
        BiFunction<Integer, Integer, Integer> bf = Calcu::multiply;
        
        System.out.println(bf.apply(55, 68));
    }
}


class Calcu {
	
    static int multiply(int a, int b) {
        return a * b;
    }
}