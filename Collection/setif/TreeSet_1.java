package setif;
import java.util.*;

public class TreeSet_1 {
	
    public static void main(String[] args) {
    	
        TreeSet<Student_N> set = new TreeSet<Student_N>(new NameComparator());
        
        set.add(new Student_N(2, "B"));
        set.add(new Student_N(1, "A"));
        set.add(new Student_N(4, "C"));
        set.add(new Student_N(3, "E"));
        set.add(new Student_N(6, "D"));
        set.add(new Student_N(5, "F"));


        for (Student_N s : set)
            System.out.println(s.name + " " + s.id);
    }
}


class Student_N implements Comparable<Student_N> {
    int id;
    String name;

    Student_N(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student_N s)
    {
        return this.id - s.id; // natural order
    }
}

class NameComparator implements Comparator<Student_N> 
{
    public int compare(Student_N s1, Student_N s2) 
    {
        return s1.name.compareTo(s2.name);
    }
}