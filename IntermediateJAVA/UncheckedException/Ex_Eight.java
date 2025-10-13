package UncheckedException;

import java.util.*;

public class Ex_Eight {
    public static void main(String[] args) {
        try {
        	
            List<Integer> list = Arrays.asList(1, 2, 3);
            int index = 4;
            if (index >= list.size()) {
            	
                throw new IndexOutOfBoundsException("Index out of range: " + index);
            }
        } 
        
        catch (IndexOutOfBoundsException e) {
        	
            System.out.println("Caught: " + e.getMessage());
        } 
        
        finally {
        	
            System.out.println("List access checked.");
        }
    }
}
