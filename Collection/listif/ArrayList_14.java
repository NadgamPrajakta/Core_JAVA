package listif;
import java.util.*;

public class ArrayList_14 {
	
    public static void main(String[] args) {
    	
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(40, 10, 20, 30, 50, 60, 70, 80, 90));
        
        Collections.sort(list);
        
        System.out.println("Sorted: " + list);
    }
}
