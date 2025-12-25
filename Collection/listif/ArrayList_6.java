package listif;
import java.util.*;

public class ArrayList_6 {
	
    public static void main(String[] args) {
    	
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "White", "Black", "Purple", "Turquoise"));
        
        System.out.println("Contains Blue? " + list.contains("Blue"));
        
        System.out.println("Size: " + list.size());
    }
}
