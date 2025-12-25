package method_references;
import java.util.function.Supplier;

public class ObjInstanceMethodRef_2 {
	
    public static void main(String[] args) {
    	
        Employee e = new Employee();
        
        Supplier<Integer> s = e::getSalary;
        
        System.out.println(s.get());
    }
}


class Employee {
	
    int salary = 50000;
    
    int getSalary() {
        return salary;
    }
}