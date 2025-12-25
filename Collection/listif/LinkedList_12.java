package listif;
import java.util.*;

public class LinkedList_12 {
	
    public static void main(String[] args) {
    	
        LinkedList<String> list = new LinkedList<>(Arrays.asList("One","Two","Three"));
        
        System.out.println("Peek: " + list.peek());
        System.out.println(list);
    }
}
