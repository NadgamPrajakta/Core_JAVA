package listif;
import java.util.*;

public class Vector_16 {
	
    public static void main(String[] args) {
    	
        Vector<String> v = new Vector<String>(Arrays.asList("X","Y","Z"));
        
        Enumeration<String> e = v.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
