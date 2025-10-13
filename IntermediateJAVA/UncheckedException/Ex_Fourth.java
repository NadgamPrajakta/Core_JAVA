package UncheckedException;

public class Ex_Fourth {
    public static void main(String[] args) {
        try {
        	
            String value = "abc";
            if (!value.matches("\\d+")) {
            	
                throw new NumberFormatException("Cannot convert to integer: " + value);
            }
        } 
        
        catch (NumberFormatException e) {
        	
            System.out.println("Caught: " + e.getMessage());
        } 
        
        finally {
        	
            System.out.println("Number conversion attempt done.");
        }
    }
}
