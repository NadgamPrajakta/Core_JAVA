package listif;
import java.util.*;

public class Vector_10 {
	
    public static void main(String[] args) {
    	
        Vector<String> v = new Vector<>(Arrays.asList("A","B","C"));
        
        System.out.println(v.contains("B"));
        System.out.println(v.size());
    }
}
