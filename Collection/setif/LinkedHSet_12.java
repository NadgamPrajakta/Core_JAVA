package setif;
import java.util.*;

public class LinkedHSet_12 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<Course_8> s1=new LinkedHashSet<Course_8>();
        
        LinkedHashSet<Course_8> s2=new LinkedHashSet<Course_8>();
        
        Course_8 c=new Course_8(10);
        
        s1.add(c); s2.add(c);
        s1.retainAll(s2);
        
        System.out.println(s1.size());
    }
}


class Course_8 {
	
    int id;
    
    Course_8(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((Course_8)o).id;
    	
    }
    
    public int hashCode()
    {
    	return id;
    	
    }
}