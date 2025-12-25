package setif;
import java.util.*;

public class TreeSet_13 {
	
    public static void main(String[] args) {
    	
        TreeSet<Teacher_20> set = new TreeSet<Teacher_20>(new TeacherIdDescComparator());
        
        set.add(new Teacher_20("X", 1));
        set.add(new Teacher_20("Y", 2));

        for (Teacher_20 t : set)
            System.out.println(t.name + " " + t.id);
    }
}


class Teacher_20 implements Comparable<Teacher_20> {
    String name;
    int id;

    Teacher_20(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int compareTo(Teacher_20 t) 
    {
        return name.compareTo(t.name);
    }
}

class TeacherIdDescComparator implements Comparator<Teacher_20>
{
    public int compare(Teacher_20 t1, Teacher_20 t2)
    {
        return t2.id - t1.id;
    }
}
