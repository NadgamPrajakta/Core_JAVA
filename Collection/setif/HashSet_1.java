package setif;
import java.util.*;

public class HashSet_1 {
	
    public static void main(String[] args) {
    	
        HashSet<Studentt> set = new HashSet<Studentt>();
        
        set.add(new Studentt(1));
        set.add(new Studentt(1));
        
        System.out.println(set.size());
    }
}

class Studentt {
    int id;
    Studentt(int id) { this.id = id; }

    public boolean equals(Object o) {
    	Studentt s = (Studentt)o;
        return id == s.id;
    }
    public int hashCode() {
        return id;
    }
}
