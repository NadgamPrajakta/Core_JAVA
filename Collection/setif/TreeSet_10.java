package setif;
import java.util.*;

public class TreeSet_10 {
	
    public static void main(String[] args) {
    	
        TreeSet<Country_30> set = new TreeSet<Country_30>(new CountryDescComparator());
        
        set.add(new Country_30("India"));
        set.add(new Country_30("USA"));

        for (Country_30 c : set)
            System.out.println(c.name);
    }
}


class Country_30 implements Comparable<Country_30> {
    String name;

    Country_30(String name) {
        this.name = name;
    }

    public int compareTo(Country_30 c) 
    {
        return name.compareTo(c.name);
    }
}

class CountryDescComparator implements Comparator<Country_30> 
{
    public int compare(Country_30 c1, Country_30 c2) 
    {
        return c2.name.compareTo(c1.name);
    }
}