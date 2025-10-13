package UncheckedException;

public class Ex_Seventh {
    public static void main(String[] args) {
        try {
        	
            boolean started = false;
            if (!started) {
            	
                throw new IllegalStateException("System not started yet");
            }
        } 
        
        catch (IllegalStateException e) {
        	
            System.out.println("Caught: " + e.getMessage());
        } 
        
        finally {
        	
            System.out.println("System state verified.");
        }
    }
}
