package UncheckedException;

public class Ex_First {
    public static void main(String[] args) {
        try {
        	
            int b = 0;
            if (b == 0) {
            	
                throw new ArithmeticException("Cannot divide by zero");
            }
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Caught: " + e.getMessage());
        } 
        
        finally {
        	
            System.out.println("Division operation completed.");
        }
    }
}
