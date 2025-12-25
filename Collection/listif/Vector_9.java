package listif;
import java.util.*;

public class Vector_9 {
	
    public static void main(String[] args) {
    	
        Vector<String> v = new Vector<String>(Arrays.asList("Pen","Pencil","Eraser"));

        v.remove(0);
        v.remove("Eraser");
        System.out.println(v);
    }
}
