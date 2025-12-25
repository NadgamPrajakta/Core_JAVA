package setif;
import java.util.*;

public class TreeSet_6 {
	
    public static void main(String[] args) {
    	
        TreeSet<City_44> set = new TreeSet<City_44>(new CityLengthComparator());
        
        set.add(new City_44(1, "Pune"));
        set.add(new City_44(2, "Mumbai"));
        set.add(new City_44(3, "Solapur"));
        set.add(new City_44(4, "Nagpur"));
        set.add(new City_44(5, "Dehli"));
        set.add(new City_44(6, "Raipur"));
        set.add(new City_44(7, "Satara"));
        set.add(new City_44(8, "Nashik"));
        set.add(new City_44(9, "Latur"));

        for (City_44 c : set)
            System.out.println(c.name);
    }
}


class City_44 implements Comparable<City_44> {
	
    int id;
    String name;

    City_44(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(City_44 c) 
    {
        return id - c.id;
    }
}

class CityLengthComparator implements Comparator<City_44> 
{
    public int compare(City_44 c1, City_44 c2) 
    {
        return c1.name.length() - c2.name.length();
    }
}