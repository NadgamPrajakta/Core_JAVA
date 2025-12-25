package method_references;
import java.util.function.Consumer;

public class StaticMethodRef_1 {
	
    public static void main(String[] args) {
    	
        Consumer<String> c = Printer::print;
        
        c.accept("Hello Java");
    }
}


class Printer {
	
    static void print(String msg) {
    	
        System.out.println(msg);
    }
}

