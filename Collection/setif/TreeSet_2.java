package setif;
import java.util.*;

public class TreeSet_2 {
	
    public static void main(String[] args) {
    	
        TreeSet<Employeeee> set = new TreeSet<Employeeee>(new DescComparator());
        
        set.add(new Employeeee(1));
        set.add(new Employeeee(3));
        set.add(new Employeeee(2));
        set.add(new Employeeee(4));
        set.add(new Employeeee(6));
        set.add(new Employeeee(5));
        set.add(new Employeeee(8));
        set.add(new Employeeee(7));


        for (Employeeee e : set)
            System.out.println(e.id);
    }
}


class Employeeee implements Comparable<Employeeee> {
    int id;

    Employeeee(int id) {
        this.id = id;
    }

    public int compareTo(Employeeee e)
    {
        return id - e.id;
    }
}

class DescComparator implements Comparator<Employeeee> 
{
    public int compare(Employeeee e1, Employeeee e2)
    {
        return e2.id - e1.id;
    }
}