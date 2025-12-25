package listif;
import java.util.*;

public class LinkedList_3 {
	
    public static void main(String[] args) {
    	
        LinkedList<String> list = new LinkedList<>();
        
        list.add("B");
        list.addFirst("A");
        list.addLast("C");
        
        System.out.println(list);
    }
}
