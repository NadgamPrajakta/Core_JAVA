package listif;
import java.util.*;



public class ArrayList_9 {
	
    public static void main(String[] args) {
    	
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C"));
        
        System.out.println("First A: " + list.indexOf("A"));
        
        System.out.println("Last A: " + list.lastIndexOf("A"));
    }
}
