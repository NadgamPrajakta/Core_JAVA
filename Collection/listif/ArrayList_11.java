package listif;

import java.util.*;

public class ArrayList_11 {
	
    public static void main(String[] args) {
    	
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        
        System.out.println("Sublist(1,4): " + list.subList(1, 4));
    }
}
