package listif;
import java.util.*;

public class Stack_11 {
	
    public static void main(String[] args) {
    	
        Stack<String> st = new Stack<String>();
        
        st.push("Sun");
        st.push("Moon");
        st.push("Star");
        for(String s : st)
            System.out.println(s);
    }
}
