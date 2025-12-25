package listif;
import java.util.*;

public class LinkedList_10 {
	
    public static void main(String[] args) {
    	
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Sun","Moon","Star"));
        
        for(String s : list)
            System.out.println(s);
    }
}
