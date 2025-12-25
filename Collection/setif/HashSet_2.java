package setif;
import java.util.*;

public class HashSet_2 {
	
    public static void main(String[] args) {
    	
        HashSet<Emp> set=new HashSet<Emp>();
        
        set.add(new Emp(1,"A"));
        set.add(new Emp(1,"A"));
        
        System.out.println(set.size());
    }
}


class Emp {
    int id; String name;
    Emp(int id, String name) { this.id=id; this.name=name; }

    public boolean equals(Object o) {
        Emp e=(Emp)o;
        return id==e.id && name.equals(e.name);
    }
    public int hashCode() {
        return Objects.hash(id,name);
    }
}