package listif;
import java.util.*;

public class Vector_14 {
	
    public static void main(String[] args) {
    	
        Vector<String> v = new Vector<String>(Arrays.asList("A","B","A","C"));
        
        System.out.println(v.indexOf("A"));
        System.out.println(v.lastIndexOf("A"));
    }
}
