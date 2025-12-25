package method_references;
import java.util.function.Function;

public class ObjInstanceMethodRef_8 {
	
    public static void main(String[] args) {
    	
    	Student_40 s = new Student_40();
        
        Function<Integer, String> f = s::getGrade;
        System.out.println(f.apply(70));
    }
}


class Student_40 {
	
    String getGrade(int marks) 
    
    {
        return marks >= 60 ? "A" : "B";
    }
}