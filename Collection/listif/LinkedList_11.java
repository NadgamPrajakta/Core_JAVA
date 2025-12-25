package listif;
import java.util.*;

public class LinkedList_11 {
	
    public static void main(String[] args) {
    	
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","A","C"));
        
        System.out.println(list.indexOf("A"));
        System.out.println(list.lastIndexOf("A"));
    }
}
