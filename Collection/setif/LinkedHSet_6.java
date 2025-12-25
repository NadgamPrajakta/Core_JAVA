package setif;
import java.util.*;

public class LinkedHSet_6 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<Pen_6> set=new LinkedHashSet<Pen_6>();
        
        set.add(new Pen_6("Cello"));
        set.add(new Pen_6("Trimax"));
        set.add(new Pen_6("Uni-ball"));
        set.add(new Pen_6("Reynolds"));
        set.add(new Pen_6("Nataraj"));
        set.add(new Pen_6("Bic Cristal"));
        set.add(new Pen_6("Jetstream"));
        set.add(new Pen_6("Montblanc"));
        set.add(new Pen_6("Lamy"));
        
        
        System.out.println(set.size());
    }
}


class Pen_6 {
	
    String brand;
    
    Pen_6(String b)
    
    {
    	brand=b;
    	
    }

    public boolean equals(Object o)
    
    {
    	return brand.equals(((Pen_6)o).brand);
    	
    }
    
    public int hashCode()
    
    {
    	return brand.hashCode();
    	
    }
}