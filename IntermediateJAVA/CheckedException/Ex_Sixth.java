package CheckedException;

import java.text.*;

public class Ex_Sixth {
    public static void main(String[] args) {
        try {
            String date = "invalid";
            if (!date.matches("\\d{2}/\\d{2}/\\d{4}"))
            {
                throw new ParseException("Date format incorrect: " + date, 0);
            }
        } 
        
        catch (ParseException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        
        finally {
            System.out.println("Date validation finished.");
        }
    }
}
