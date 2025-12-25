package listif;
import java.util.*;

public class Vector_4 {
	
    public static void main(String[] args) {
    	
        Vector<Integer> v = new Vector<Integer>();
        
        v.add(10);
        v.add(30);
        v.add(1, 20);
        v.add(40);
        v.add(23);
        v.add(14);
        v.add(50);
        
        System.out.println(v);
    }
}
