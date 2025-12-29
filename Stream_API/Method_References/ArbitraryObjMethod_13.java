package method_references;
import java.util.function.Predicate;

public class ArbitraryObjMethod_13 {
	
    public static void main(String[] args) {
    	
        Predicate<Gym> p = Gym::isOpen;
        
        System.out.println(p.test(new Gym()));
    }
}


class Gym {
	
    boolean open = false;
    
    boolean isOpen()
    {
        return open;
    }
}