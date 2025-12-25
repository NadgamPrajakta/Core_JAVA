package listif;
import java.util.*;

public class LinkedList_6 {
	
    public static void main(String[] args) {
    	
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Pen","Pencil","Eraser"));
        
        list.remove(0);
        list.remove("Eraser");
        System.out.println(list);
    }
}
