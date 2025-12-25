package method_references;
import java.util.function.Consumer;

public class ObjInstanceMethodRef_14 {
	
    public static void main(String[] args) {
    	
        Course c = new Course();
        
        Consumer<Course> con = course -> c.showCourse();
        con.accept(c);
    }
}


class Course
{
    void showCourse() 
    {
        System.out.println("Artificial Intelligence");
    }
}