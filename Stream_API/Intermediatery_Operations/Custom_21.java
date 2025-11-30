package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Custom_21 {

    public static void main(String[] args) {

        List<Product_1> products = new ArrayList<>();
        products.add(new Product_1("Laptop", 50000));
        products.add(new Product_1("Phone", 30000));
        products.add(new Product_1("Tablet", 20000));

        products.stream()
            .map(new DiscountCalculator())
            .forEach(new DiscountPrinter());
    }
}

class Product_1 {
    String name;
    int price;

    Product_1(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class DiscountCalculator implements Function<Product_1, String> {
    public String apply(Product_1 p) {
        double disc = p.price - (p.price * 0.10);
        return p.name + " → After 10% Discount: " + disc;
    }
}

class DiscountPrinter implements java.util.function.Consumer<String> {
    public void accept(String t) {
        System.out.println(t);
    }
}
