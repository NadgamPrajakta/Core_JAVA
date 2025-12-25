package listif;
import java.util.*;

public class Vector_7 {
	
    public static void main(String[] args) {
    	
        Vector<Integer> v = new Vector<>(Arrays.asList(10,20,30, 40, 50, 60, 70, 80, 90, 56, 43, 23, 56));
        
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
    }
}
