package setif;
import java.util.*;

public class TreeSet_12 {
	
    public static void main(String[] args) {
    	
        TreeSet<Student3> set = new TreeSet<Student3>(new RollDescComparator());
        
        set.add(new Student3(1));
        set.add(new Student3(3));

        for (Student3 s : set)
            System.out.println(s.roll);
    }
}


class Student3 implements Comparable<Student3> {
    int roll;

    Student3(int roll) {
        this.roll = roll;
    }

    public int compareTo(Student3 s)
    {
        return roll - s.roll;
    }
}

class RollDescComparator implements Comparator<Student3>
{
    public int compare(Student3 s1, Student3 s2) 
    {
        return s2.roll - s1.roll;
    }
}