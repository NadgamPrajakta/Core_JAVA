package setif;
import java.util.*;

public class HashSet_12 {
	
    public static void main(String[] args){
    	
        HashSet<Course> s1=new HashSet<Course>();
        HashSet<Course> s2=new HashSet<Course>();
        
        Course c=new Course(10);
        s1.add(c); s2.add(c);
        s1.retainAll(s2);
        System.out.println(s1.size());
    }
}


class Course {
    int id;
    
    Course(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((Course)o).id;
    	
    }
    
    public int hashCode()
    
    {
    	return id;
    	
    }
}