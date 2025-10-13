package UncheckedException;

public class Ex_Nightth {
    public static void main(String[] args) {
        try {
        	
            int size = -3;
            if (size < 0) {
            	
                throw new NegativeArraySizeException("Array size cannot be negative");
            }
        } 
        
        catch (NegativeArraySizeException e) {
        	
            System.out.println("Caught: " + e.getMessage());
        } 
        
        finally {
        	
            System.out.println("Array size validated.");
        }
    }
}
