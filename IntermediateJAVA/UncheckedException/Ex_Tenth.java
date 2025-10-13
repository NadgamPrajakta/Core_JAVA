package UncheckedException;

import java.util.*;

public class Ex_Tenth {
    public static void main(String[] args) {
        try {
        	
            List<String> list = Arrays.asList("A", "B");
            boolean modify = true;
            if (modify) {
            	
                throw new Exception("Cannot modify fixed-size list");
            }
        } 
        
        catch (Exception e) {
        	
            System.out.println("Caught: " + e.getMessage());
        } 
        
        finally {
        	
            System.out.println("List operation validation done.");
        }
    }
}

