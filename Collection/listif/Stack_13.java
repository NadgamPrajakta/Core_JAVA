package listif;
import java.util.*;

public class Stack_13 {
	
    public static void main(String[] args) {
    	
        Stack<Integer> st = new Stack<Integer>();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);

        while(!st.isEmpty())
            System.out.println(st.pop());
    }
}
