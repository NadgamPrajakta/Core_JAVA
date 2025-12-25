package listif;
import java.util.*;

public class Stack_5 {
	
    public static void main(String[] args) {
    	
        Stack<Integer> st = new Stack<Integer>();
        
        System.out.println(st.isEmpty());
        
        st.push(5);
        st.push(6);
        st.push(4);
        st.push(3);
        st.push(8);
        st.push(9);
        
        System.out.println(st.isEmpty());
    }
}
