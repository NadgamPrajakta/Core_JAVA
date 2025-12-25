package listif;
import java.util.*;

public class Vector_8 {
	
    public static void main(String[] args) {
    	
        Vector<String> v = new Vector<String>(Arrays.asList("Dog","Cat","Cow"));
        
        v.set(1, "Horse");
        System.out.println(v);
    }
}
