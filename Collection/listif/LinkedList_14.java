package listif;
import java.util.*;

public class LinkedList_14 {
	
    public static void main(String[] args) {
    	
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10,20,30));
        
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
