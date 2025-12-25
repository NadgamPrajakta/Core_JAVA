package listif;

import java.util.*;

public class Stack_7 {
	
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
        st.push("I");
        st.push("k");
        
        System.out.println(st.search("A"));
        System.out.println(st.search("X"));
    }
}

