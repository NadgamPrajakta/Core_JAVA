package method_references;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ObjInstanceMethodRef_1 {
	
    public static void main(String[] args) {
    	
    	Student_20 s = new Student_20();
    	
        Predicate<Integer> p = s::isPassed;
        
        System.out.println(p.test(75));
    }
}


class Student_20 {
    boolean isPassed(int marks) {
        return marks >= 40;
    }
}