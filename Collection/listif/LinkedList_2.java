package listif;
import java.util.*;

public class LinkedList_2 {
	
    public static void main(String[] args) {
    	
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        list.add(10);
        list.add(30);
        list.add(1, 20);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(45);
        list.add(67);
        list.add(89);
        
        System.out.println(list);
    }
}
