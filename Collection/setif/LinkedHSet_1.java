package setif;
import java.util.*;

public class LinkedHSet_1 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<Student_4> set=new LinkedHashSet<Student_4>();
        
        set.add(new Student_4(3));
        set.add(new Student_4(1));
        set.add(new Student_4(2));
        
        for(Student_4 s:set)
            System.out.println(s.id);
    }
}


class Student_4 {
	
    int id;
    
    Student_4(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((Student_4)o).id;
    	
    }
    
    public int hashCode()
    
    {
    	return id;
    	
    }
}