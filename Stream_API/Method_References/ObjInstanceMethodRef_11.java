package method_references;

import java.util.function.Supplier;

public class ObjInstanceMethodRef_11 {
	
    public static void main(String[] args) {
    	
        Teacher t = new Teacher();
        
        Supplier<Integer> s = t::getSalary;
        System.out.println(s.get());
    }
}


class Teacher {
	
    int salary = 45000;
    int getSalary() 
    
    {
        return salary;
    }
}
