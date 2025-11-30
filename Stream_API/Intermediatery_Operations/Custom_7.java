package intermediatary_ops;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Custom_7 {
    public static void main(String[] args) {
    	
        List<Product> products = Arrays.asList(
            new Product("Pencil", Arrays.asList("stationery", "office")),
            new Product("Notebook", Arrays.asList("stationery", "school")),
            new Product("Coffee Mug", Arrays.asList("kitchen", "office"))
        );

       
        products.stream()
                .mapMulti(new ProductToCategoryStrings())   
                .filter(new CategoryFilterPredicate("office")) 
                .sorted(new CategoryStringComparator())
                .forEach(new CategoryStringPrinter());
    }
}


class Product {
    final String name;
    final List<String> categories;
    
    Product(String name, List<String> categories) {
    	
    	this.name = name; 
    	this.categories = categories; 
   }
}


class ProductToCategoryStrings implements BiConsumer<Product, Consumer<String>> {
	
    public void accept(Product p, Consumer<String> consumer) {
        for (String c : p.categories) {
            consumer.accept(c + ":" + p.name);
        }
    }
}


class CategoryFilterPredicate implements Predicate<String> {
    private final String mustContain;
    CategoryFilterPredicate(String mustContain) {
    	this.mustContain = mustContain; 
    	}
    
    public boolean test(String s) {
    	return s.toLowerCase().contains(mustContain.toLowerCase()); }
}


class CategoryStringComparator implements Comparator<String> {
	
    public int compare(String a, String b) { 
    	return a.compareTo(b); }
}


class CategoryStringPrinter implements Consumer<String> {
	
    public void accept(String s) {
    	System.out.println("Matched -> " + s); }
}
