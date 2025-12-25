package listif;
import java.util.*;

public class LinkedList_13 {
	
    public static void main(String[] args) {
    	
        LinkedList<String> list = new LinkedList<>(Arrays.asList("X","Y","Z"));
        
        System.out.println("Poll: " + list.poll());
        System.out.println(list);
    }
}
