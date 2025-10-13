package UncheckedException;

public class Ex_Second {
    public static void main(String[] args) {
        try {
        	
            String str = null;
            if (str == null) {
            	
                throw new NullPointerException("String value is null");
            }
         } 
       
        catch (NullPointerException e) {
        	
            System.out.println("Caught: " + e.getMessage());
        }
        
        finally {
        	
            System.out.println("Null check completed.");
        }
    }
}
