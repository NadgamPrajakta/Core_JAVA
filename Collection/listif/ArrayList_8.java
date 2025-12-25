package listif;
import java.util.*;

public class ArrayList_8 {
	
    public static void main(String[] args) {
    	
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Sun", "Moon", "Star"));
        
        for (String item : list) {
        	
            System.out.println(item);
        }
    }
}
