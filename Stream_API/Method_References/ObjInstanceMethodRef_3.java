package method_references;
import java.util.function.Predicate;

public class ObjInstanceMethodRef_3 {
	
    public static void main(String[] args) {
    	
    	Employeeee e = new Employeeee();
        
        Predicate<Integer> p = e::hasBonus;
        
        System.out.println(p.test(70000));
    }
}


class Employeeee {
    boolean hasBonus(int salary) {
        return salary > 60000;
    }
}