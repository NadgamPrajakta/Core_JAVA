package setif;
import java.util.*;

public class LinkedHSet_2 {
    public static void main(String[] args){
    	
        LinkedHashSet<Employee> set=new LinkedHashSet<Employee>();
        
        set.add(new Employee(1));
        set.add(new Employee(1));
        
        System.out.println(set.size());
    }
}


class Employee {
    int id;
    
    Employee(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((Employee)o).id;
    	
    }
    
    public int hashCode()
    
    {
    	return id;
    	
    }
}
