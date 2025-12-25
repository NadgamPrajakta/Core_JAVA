package listif;
import java.util.*;

public class Stack_9 {
	
    public static void main(String[] args) {
    	
        Stack<String> st = new Stack<String>();
        
        st.push("One");
        st.push("Two");
        st.push("Three");
        st.push("Four");
        st.push("Five");
        st.push("Six");
        st.push("Seven");
        st.push("Eight");
        st.push("Nine");
        st.push("Ten");
        st.push("Eleven");
        
        System.out.println(st.get(4));
    }
}
