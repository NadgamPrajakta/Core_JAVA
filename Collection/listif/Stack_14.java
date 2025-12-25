package listif;
import java.util.*;

public class Stack_14 {
	
    public static void main(String[] args) {
    	
        Stack<String> st = new Stack<String>();
        
        st.push("Java");
        st.push("Python");
        st.push("HTML");
        st.push("CSS");
        st.push("Javascript");
        st.push("SpringBoot");
        st.push("BootStrap");
        
        System.out.println(st.contains("Java"));
    }
}
