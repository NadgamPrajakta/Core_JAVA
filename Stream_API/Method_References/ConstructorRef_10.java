package method_references;

import java.util.function.Function;

public class ConstructorRef_10 {
	
    public static void main(String[] args) {
    	
        Function<Integer, Course_8> f = Course_8::new;
        System.out.println(f.apply(6).duration);
    }
}


class Course_8 {
	
    int duration;
    
    Course_8(int duration)
    {
        this.duration = duration;
    }
}