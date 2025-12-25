package listif;

import java.util.*;

public class Stack_3 {
	
    public static void main(String[] args) {
    	
        Stack<String> st = new Stack<String>();
        
        st.push("A");
        st.push("B");
        st.push("C");
        st.push("D");
        st.push("E");
        st.push("F");
        st.push("G");
        st.push("H");
        
        System.out.println(st.pop());
        System.out.println(st);
    }
}
