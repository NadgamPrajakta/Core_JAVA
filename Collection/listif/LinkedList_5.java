package listif;
import java.util.*;

public class LinkedList_5 {
	
    public static void main(String[] args) {
    	
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red","Blue","Green"));
        
        list.set(1, "Yellow");
        System.out.println(list);
    }
}
