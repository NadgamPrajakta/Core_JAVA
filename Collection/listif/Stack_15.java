package listif;
import java.util.*;

public class Stack_15 {
	
    public static void main(String[] args) {
    	
        Stack<String> st = new Stack<String>();
        
        st.push("A");
        st.push("B");
        st.remove("A");
        System.out.println(st);
    }
}
