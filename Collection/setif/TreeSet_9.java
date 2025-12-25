package setif;
import java.util.*;

public class TreeSet_9 {
	
    public static void main(String[] args) {
    	
        TreeSet<Staff> set = new TreeSet<>(new SalaryComparator());
        
        set.add(new Staff(1, 30000));
        set.add(new Staff(2, 50000));
        set.add(new Staff(4, 60000));
        set.add(new Staff(3, 80000));
        set.add(new Staff(7, 10000));
        set.add(new Staff(8, 20000));

        for (Staff s : set)
            System.out.println(s.id + " " + s.salary);
    }
}


class Staff implements Comparable<Staff> {
    int id;
    int salary;

    Staff(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public int compareTo(Staff s) 
    {
        return id - s.id;
    }
}

class SalaryComparator implements Comparator<Staff>
{
    public int compare(Staff s1, Staff s2) 
    {
        return s1.salary - s2.salary;
    }
}