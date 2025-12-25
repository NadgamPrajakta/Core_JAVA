package listif;
import java.util.*;

public class ArrayList_12 {
	
    public static void main(String[] args) {
    	
        ArrayList<String> list = new ArrayList<>(Arrays.asList("One","Two","Three"));
        
        Iterator<String> it = list.iterator();
        
        while(it.hasNext()) {
        	
            System.out.println(it.next());
        }
    }
}
