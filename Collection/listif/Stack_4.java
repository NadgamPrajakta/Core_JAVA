package listif;
import java.util.*;

public class Stack_4 {
	
    public static void main(String[] args) {
    	
        Stack<String> st = new Stack<String>();
        
        st.push("Red");
        st.push("Blue");
        st.push("White");
        st.push("Black");
        st.push("Green");
        st.push("Gray");
        st.push("Pink");
        st.push("Yellow");
        
        System.out.println(st.peek());
    }
}
