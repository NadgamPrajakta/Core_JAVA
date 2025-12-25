package listif;
import java.util.*;

public class LinkedList_7 {
	
    public static void main(String[] args) {
    	
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4, 5, 6, 7, 8, 9, 77, 54, 34, 23));
        
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
