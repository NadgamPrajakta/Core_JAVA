package setif;
import java.util.*;

public class LinkedHSet_11 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<Teacher_6> s1=new LinkedHashSet<Teacher_6>();
        
        LinkedHashSet<Teacher_6> s2=new LinkedHashSet<Teacher_6>();
        
        Teacher_6 t=new Teacher_6(1);
        s1.add(t); s2.add(t);
        s1.removeAll(s2);
        
        System.out.println(s1.size());
    }
}


class Teacher_6 {
	
    int id;
    
    Teacher_6(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((Teacher_6)o).id;
    	
    }
    
    public int hashCode()
    
    {
    	return id;
    	
    }
}