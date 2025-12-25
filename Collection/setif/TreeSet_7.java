package setif;
import java.util.*;

public class TreeSet_7 {
	
    public static void main(String[] args) {
    	
        TreeSet<Car_76> set = new TreeSet<Car_76>(new CarIdComparator());
        
        set.add(new Car_76("BMW", 2));
        set.add(new Car_76("Audi", 1));
        set.add(new Car_76("Suzuki", 3));
        set.add(new Car_76("MG", 1));
        set.add(new Car_76("Hyundai Creta", 1));
        set.add(new Car_76("Tata Nexon", 1));

        for (Car_76 c : set)
            System.out.println(c.name + " " + c.id);
    }
}


class Car_76 implements Comparable<Car_76> {
	
    String name;
    int id;

    Car_76(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int compareTo(Car_76 c)
    {
        return name.compareTo(c.name);
    }
}

class CarIdComparator implements Comparator<Car_76> 
{
    public int compare(Car_76 c1, Car_76 c2) 
    {
        return c1.id - c2.id;
    }
}