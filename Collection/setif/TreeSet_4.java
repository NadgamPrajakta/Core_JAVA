package setif;
import java.util.*;

public class TreeSet_4 {
	
    public static void main(String[] args) {
    	
        TreeSet<Product_20> set = new TreeSet<Product_20>(new NameDescComparator());
        
        set.add(new Product_20(1, "Laptop"));
        set.add(new Product_20(2, "Mobile"));
        set.add(new Product_20(2, "Buds"));
        set.add(new Product_20(2, "Adaptor"));
        set.add(new Product_20(2, "Cable"));
        set.add(new Product_20(2, "Printer"));
        set.add(new Product_20(2, "PC"));

        for (Product_20 p : set)
            System.out.println(p.name);
    }
}


class Product_20 implements Comparable<Product_20> {
    int id;
    String name;

    Product_20(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Product_20 p)
    {
        return id - p.id;
    }
}

class NameDescComparator implements Comparator<Product_20>
{
    public int compare(Product_20 p1, Product_20 p2) 
    {
        return p2.name.compareTo(p1.name);
    }
}