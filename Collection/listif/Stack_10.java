package listif;
import java.util.*;

public class Stack_10 {
	
    public static void main(String[] args) {
    	
        Stack<String> st = new Stack<String>();
        
        st.push("Dog");
        st.push("Cat");
        st.set(1, "Horse");
        
        System.out.println(st);
    }
}
