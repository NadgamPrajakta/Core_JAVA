package method_references;

import java.util.function.BiFunction;

public class ConstructorRef_12 {
	
    public static void main(String[] args) {
    	
        BiFunction<String, Double, Staff> bf = Staff::new;
        
        Staff s = bf.apply("Riya", 55000.0);
        System.out.println(s.name + " " + s.salary);
    }
}


class Staff
{
    String name;
    double salary;
    
    Staff(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
}