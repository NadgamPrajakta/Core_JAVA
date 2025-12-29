package method_references;

import java.util.function.BiFunction;

public class ConstructorRef_16 {
	
    public static void main(String[] args) {
    	
        BiFunction<String, Integer, School> bf = School::new;
        
        School s = bf.apply("ABC School", 1200);
        System.out.println(s.name + " " + s.students);
    }
}


class School
{
    String name;
    int students;
    
    School(String name, int students) 
    {
        this.name = name;
        this.students = students;
    }
}