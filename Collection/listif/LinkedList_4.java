package listif;
import java.util.*;

public class LinkedList_4 {
	
    public static void main(String[] args) {
    	
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Dog","Cat","Horse"));
        
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
