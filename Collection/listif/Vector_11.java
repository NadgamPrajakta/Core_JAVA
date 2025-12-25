package listif;
import java.util.*;

public class Vector_11 {
	
    public static void main(String[] args) {
    	
        Vector<Integer> v = new Vector<Integer>();
        
        System.out.println(v.capacity());
        v.add(1);
        System.out.println(v.capacity());
    }
}
