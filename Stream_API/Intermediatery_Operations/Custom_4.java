package intermediatary_ops;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Custom_4{
    public static void main(String[] args) {
    	
        List<Order> orders = Arrays.asList(
        		
            new Order(101, "Prajkta", 250.0, true),
            new Order(102, "John", 1200.0, false),
            new Order(103, "Sahil", 540.0, true),
            new Order(104, "Alice", 80.0, true)
        );

        
        orders.stream()
              .filter(new PaidOrderPredicate())               // only paid orders
              .map(new OrderToProcessed())                    // map Order -> ProcessedOrder (Function)
              .sorted(new ProcessedOrderComparator())         // sort by amount desc
              .forEach(new ProcessedOrderPrinter());          // print
    }
}

class Order {
    final int id; 
    final String customer;
    final double amount; 
    final boolean paid;
    
    Order(int id, String customer, double amount, boolean paid) { 
    	
    	this.id = id; 
    	this.customer = customer; 
    	this.amount = amount; 
    	this.paid = paid; }
}


class ProcessedOrder {
    final int id; 
    final String summary; 
    final double amount;
    
    ProcessedOrder(int id, String summary, double amount) { 
    	
    	this.id = id;
    	this.summary = summary;
    	this.amount = amount;
   }
}



class PaidOrderPredicate implements Predicate<Order> {
	
    public boolean test(Order o) { 
    	return o.paid; }
}


class OrderToProcessed implements Function<Order, ProcessedOrder> {
	
    public ProcessedOrder apply(Order o) {
        String summary = String.format("Order#%d for %s", o.id, o.customer);
        return new ProcessedOrder(o.id, summary, o.amount);
    }
}



class ProcessedOrderComparator implements Comparator<ProcessedOrder> {
	
    public int compare(ProcessedOrder a, ProcessedOrder b) { 
    	return Double.compare(b.amount, a.amount); }
}


class ProcessedOrderPrinter implements Consumer<ProcessedOrder> {
	
    public void accept(ProcessedOrder p) {
        System.out.println(p.summary + " — ₹" + p.amount);
    }
}
