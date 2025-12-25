package listif;
import java.util.*;

public class ArrayList_15 {
	
    public static void main(String[] args) {
    	
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "P", "M", "N", "K", "H", "G"));
        
        Collections.reverse(list);
        
        System.out.println("After Reverse:");
        
        for (String s : list)
        	
            System.out.println(s);
    }
}
