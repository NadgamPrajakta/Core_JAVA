package UncheckedException;

public class Ex_Fifth {
    public static void main(String[] args) {
        try {
        	
            Object obj = "String";
            if (obj instanceof Integer) {
            	
                throw new ClassCastException("Cannot cast String to Integer");
            }
        } 
        
        catch (ClassCastException e) {
        	
            System.out.println("Caught: " + e.getMessage());
        } 
        
        finally {
        	
            System.out.println("Type checking completed.");
        }
    }
}
