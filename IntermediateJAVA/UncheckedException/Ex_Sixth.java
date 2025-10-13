package UncheckedException;

public class Ex_Sixth {
    public static void main(String[] args) {
        try {
        	
            int age = -5;
            if (age < 0) {
            	
                throw new IllegalArgumentException("Age cannot be negative");
            }
        } 
        
        catch (IllegalArgumentException e) {
        	
            System.out.println("Caught: " + e.getMessage());
        } 
        
        finally {
        	
            System.out.println("Age validation done.");
        }
    }
}
