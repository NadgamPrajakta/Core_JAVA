package listif;
import java.util.*;

public class LinkedList_9 {
	
    public static void main(String[] args) {
    	
        LinkedList<String> list = new LinkedList<>();
        
        System.out.println(list.isEmpty());
        
        list.add("Java");
        list.add("Python");
        list.add("HTML");
        list.add("CSS");
        list.add("Javascript");
        list.add("Machine Learning");
        list.add("Computer vision");
        list.add("Deep Learning");
        
        System.out.println(list.isEmpty());
    }
}
