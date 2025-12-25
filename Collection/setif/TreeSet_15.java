package setif;
import java.util.*;

public class TreeSet_15 {
	
    public static void main(String[] args) {
    	
        TreeSet<Order_9> set = new TreeSet<>(new Comparator<Order_9>() {
        	
            public int compare(Order_9 o1, Order_9 o2) {
                return o2.id - o1.id;
            }
        });

        set.add(new Order_9(1));
        set.add(new Order_9(3));
        set.add(new Order_9(2));

        for (Order_9 o : set)
            System.out.println(o.id);
    }
}


class Order_9 implements Comparable<Order_9> {
    int id;

    Order_9(int id) {
        this.id = id;
    }

    public int compareTo(Order_9 o) {
        return id - o.id;
    }
}
