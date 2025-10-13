package UncheckedException;

public class Ex_Third {
    public static void main(String[] args) {
        try {
        	
            int index = 5;
            int[] arr = {1, 2, 3};
            if (index >= arr.length) {
            	
                throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
            }
            
        } 
        
        catch (ArrayIndexOutOfBoundsException e) {
        	
            System.out.println("Caught: " + e.getMessage());
        }
        
        finally {
        	
            System.out.println("Array access attempt finished.");
        }
    }
}
