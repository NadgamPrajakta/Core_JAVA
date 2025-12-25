package listif;
import java.util.*;

public class Stack_12 {
	
    public static void main(String[] args) {
    	
        Stack<Integer> st = new Stack<Integer>();
        
        st.push(10);
        st.push(20);
        st.push(60);
        st.push(30);
        st.push(21);
        st.push(43);
        st.push(56);
        st.push(23);
        st.push(45);
        st.push(33);
        
        Iterator<Integer> it = st.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
