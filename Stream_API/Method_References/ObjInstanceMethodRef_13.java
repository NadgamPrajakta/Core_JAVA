package method_references;
import java.util.function.Predicate;

public class ObjInstanceMethodRef_13 {
	
    public static void main(String[] args) {
    	
        Person p = new Person();
        
        Predicate<Integer> pr = p::isAdult;
        System.out.println(pr.test(21));
    }
}


class Person {
	
    boolean isAdult(int age) 
    
    {
        return age >= 18;
    }
}