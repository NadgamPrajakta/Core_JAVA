package listif;
import java.util.*;

public class Vector_17 {
	
    public static void main(String[] args) {
    	
        Vector<String> v = new Vector<String>(Arrays.asList("One","Two", "Three", "Four", "Five", "Six", "Eight", "Nine", "Ten"));
        
        System.out.println(v);
        v.clear();
        System.out.println(v);
    }
}
