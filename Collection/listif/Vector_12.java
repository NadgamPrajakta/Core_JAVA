package listif;
import java.util.*;

public class Vector_12 {
	
    public static void main(String[] args) {
    	
        Vector<String> v = new Vector<String>();
        
        System.out.println(v.isEmpty());
        v.add("Java");
        v.add("Python");
        v.add("HTML");
        v.add("CSS");
        v.add("Javascript");
        v.add("Springboot");
        
        System.out.println(v.isEmpty());
    }
}
