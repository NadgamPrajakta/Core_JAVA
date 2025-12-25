package setif;
import java.util.*;

public class HashSet_3 {
	
    public static void main(String[] args){
    	
        HashSet<Book_1> set=new HashSet<Book_1>();
        
        set.add(new Book_1(10));
        set.add(new Book_1(20));
        
        for(Book_1 b:set)
            System.out.println(b.id);
    }
}


class Book_1 {
	
    int id;
    
    Book_1(int id)
    {
    	
    	this.id=id;
    }

    public boolean equals(Object o)
    
    {
    	return id==((Book_1)o).id;
    	
    }
    
    public int hashCode(){
    	
    	return id;
    	}
}
