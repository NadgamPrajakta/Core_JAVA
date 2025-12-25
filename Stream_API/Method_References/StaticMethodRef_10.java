package method_references;

import java.util.function.Supplier;

public class StaticMethodRef_10 {
	
    public static void main(String[] args) {
    	
        Supplier<Integer> s = RandomUtil::getNumber;
        
        System.out.println(s.get());
    }
}


class RandomUtil {
	
    static int getNumber() {
        return 42;
    }
}