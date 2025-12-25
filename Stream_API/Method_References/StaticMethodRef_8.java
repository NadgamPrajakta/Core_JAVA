package method_references;

import java.util.function.Predicate;

public class StaticMethodRef_8 {
	
    public static void main(String[] args) {
    	
        Predicate<String> p = StringCheck::isEmpty;
        
        System.out.println(p.test(""));
    }
}


class StringCheck {
	
    static boolean isEmpty(String s) {
        return s.isEmpty();
    }
}