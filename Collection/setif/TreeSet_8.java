package setif;
import java.util.*;

public class TreeSet_8 {
	
    public static void main(String[] args) {
    	
        TreeSet<Student2> set = new TreeSet<Student2>(new MarksComparator());
        
        set.add(new Student2(1, 90));
        set.add(new Student2(2, 85));
        set.add(new Student2(3, 95));
        set.add(new Student2(4, 70));
        set.add(new Student2(5, 75));
        set.add(new Student2(6, 74));
        set.add(new Student2(7, 60));

        for (Student2 s : set)
            System.out.println(s.roll + " " + s.marks);
    }
}


class Student2 implements Comparable<Student2> {
	
    int roll;
    int marks;

    Student2(int roll, int marks) {
        this.roll = roll;
        this.marks = marks;
    }

    public int compareTo(Student2 s) 
    {
        return roll - s.roll;
    }
}

class MarksComparator implements Comparator<Student2> 
{
    public int compare(Student2 s1, Student2 s2) 
    {
        return s1.marks - s2.marks;
    }
}