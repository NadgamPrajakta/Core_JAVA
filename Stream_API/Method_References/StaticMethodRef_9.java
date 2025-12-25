package method_references;

import java.util.function.Supplier;

public class StaticMethodRef_9 {
	
    public static void main(String[] args) {
    	
        Supplier<String> s = MessageProvider::getMessage;
        
        System.out.println(s.get());
    }
}


class MessageProvider {
	
    static String getMessage() {
        return "Welcome to Java";
    }
}