package intermediatary_ops;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Custom_5 {
    public static void main(String[] args) {
    	
        List<Customer> customers = Arrays.asList(
            new Customer("Anil", Arrays.asList("9810012345", "8123456789")),
            new Customer("Beena", Arrays.asList("7012345678")),
            new Customer("Chetan", Arrays.asList("9810098765", "6011122334"))
        );

        
        customers.stream()
                 .flatMap(new CustomerToPhoneStream())         // turn Customer -> Stream<String>
                 .filter(new PhonePrefixPredicate("98"))       // keep phones that start with "98"
                 .sorted(new PhoneStringComparator())          // sort phone numbers
                 .forEach(new PhonePrinter());                 // print phones
    }
}


class Customer {
    final String name;
    final List<String> phones;
    
    Customer(String name, List<String> phones) { 
    	
    	this.name = name; 
    	this.phones = phones; }
}


class CustomerToPhoneStream implements Function<Customer, Stream<String>> {
	
    public Stream<String> apply(Customer c) {
        return c.phones.stream().map(p -> c.name + ":" + p); 
    }
}


class PhonePrefixPredicate implements Predicate<String> {
	
    private final String prefix;
    PhonePrefixPredicate(String prefix) {
    	this.prefix = prefix;
    	}
    
    public boolean test(String s) {
    	return s.contains(":") && s.split(":")[1].startsWith(prefix); }
}


class PhoneStringComparator implements Comparator<String> {
	
    public int compare(String a, String b) { 
    	return a.compareTo(b); }
}


class PhonePrinter implements Consumer<String> {
	
    public void accept(String s) { 
    	System.out.println("Phone -> " + s); }
}
