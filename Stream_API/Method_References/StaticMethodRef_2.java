package method_references;
import java.util.function.Consumer;

public class StaticMethodRef_2 {
	
    public static void main(String[] args) {
    	
        Consumer<Integer> c = NumberPrinter::show;
        
        c.accept(1000);
    }
}


class NumberPrinter {
	
    static void show(int n) {
    	
        System.out.println(n);
    }
}
