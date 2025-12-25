package method_references;
import java.util.function.Predicate;

public class ObjInstanceMethodRef_7 {
	
    public static void main(String[] args) {
    	
        Car c = new Car();
        
        Predicate<Integer> p = c::isFast;
        System.out.println(p.test(120));
    }
}


class Car {
	
    boolean isFast(int speed) 
    
    {
        return speed > 100;
    }
}