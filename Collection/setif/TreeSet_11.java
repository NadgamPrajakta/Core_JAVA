package setif;
import java.util.*;

public class TreeSet_11 {
	
    public static void main(String[] args) {
    	
        TreeSet<User_10> set = new TreeSet<User_10>(new MultiComparator());
        
        set.add(new User_10(2, "A"));
        set.add(new User_10(1, "A"));

        for (User_10 u : set)
            System.out.println(u.name + " " + u.id);
    }
}


class User_10 implements Comparable<User_10> {
    int id;
    String name;

    User_10(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(User_10 u) {
        return id - u.id;
    }
}

class MultiComparator implements Comparator<User_10> {
    public int compare(User_10 u1, User_10 u2) {
        int res = u1.name.compareTo(u2.name);
        return res != 0 ? res : u1.id - u2.id;
    }
}