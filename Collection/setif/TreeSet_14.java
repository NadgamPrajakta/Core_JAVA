package setif;
import java.util.*;

public class TreeSet_14 {
	
    public static void main(String[] args) {
    	
        TreeSet<Product2> set = new TreeSet<Product2>(new PriceNameComparator());
        
        set.add(new Product2(100, "Pen"));
        set.add(new Product2(100, "Book"));

        for (Product2 p : set)
            System.out.println(p.name);
    }
}


class Product2 implements Comparable<Product2> {
    int price;
    String name;

    Product2(int price, String name)
    {
        this.price = price;
        this.name = name;
    }

    public int compareTo(Product2 p)
    {
        return price - p.price;
    }
}

class PriceNameComparator implements Comparator<Product2>
{
    public int compare(Product2 p1, Product2 p2)
    {
        int res = p1.price - p2.price;
        return res != 0 ? res : p1.name.compareTo(p2.name);
    }
}