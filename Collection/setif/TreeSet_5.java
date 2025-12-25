package setif;
import java.util.*;

public class TreeSet_5 {
	
    public static void main(String[] args) {
    	
        TreeSet<Item> set = new TreeSet<Item>(new PriceDescComparator());
        
        set.add(new Item(100));
        set.add(new Item(200));
        set.add(new Item(300));
        set.add(new Item(400));
        set.add(new Item(500));
        set.add(new Item(600));
        set.add(new Item(700));
        set.add(new Item(800));

        for (Item i : set)
            System.out.println(i.price);
    }
}


class Item implements Comparable<Item> {
    int price;

    Item(int price) {
        this.price = price;
    }

    public int compareTo(Item i)
    {
        return price - i.price;
    }
}

class PriceDescComparator implements Comparator<Item> 
{
    public int compare(Item i1, Item i2) 
    {
        return i2.price - i1.price;
    }
}