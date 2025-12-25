package listif;
import java.util.*;

public class Vector_15 {
	
    public static void main(String[] args) {
    	
        Vector<Integer> v = new Vector<>(Arrays.asList(10,20,30, 40, 50, 60, 80, 79));
        
        Iterator<Integer> it = v.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
