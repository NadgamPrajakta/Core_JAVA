package setif;
import java.util.*;

public class LinkedHSet_3 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<Book_4> set=new LinkedHashSet<Book_4>();
    	
        set.add(new Book_4("Java"));
        set.add(new Book_4("Python"));
        set.add(new Book_4("CSS"));
        set.add(new Book_4("HTML"));
        set.add(new Book_4("Javascript"));
        set.add(new Book_4("React"));
        
        for(Book_4 b:set)
            System.out.println(b.name);
    }
}


class Book_4 {
    String name;
    
    Book_4(String n)
    
    {
    	name=n;
    	
    }

    public boolean equals(Object o)
    
    {
    	return name.equals(((Book_4)o).name);
    	
    }
    
    public int hashCode()
    
    {
    	return name.hashCode();
    	
    }
}
