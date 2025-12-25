package listif;
import java.util.*;

public class LinkedList_8 {
	
    public static void main(String[] args) {
    	
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C", "D", "T", "P"));
        
        System.out.println(list.contains("B"));
        System.out.println(list.size());
    }
}
