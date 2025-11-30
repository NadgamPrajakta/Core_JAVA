package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Custom_27 {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("Keyboard", 800));
        items.add(new Item("Mouse", 500));
        items.add(new Item("Monitor", 6000));
        items.add(new Item("SSD", 2500));

        items.stream()
            .filter(new PriceFilter())
            .forEach(new ItemPrinter());
    }
}

class Item {
    String name;
    int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class PriceFilter implements Predicate<Item> {
    public boolean test(Item i) {
        return i.price >= 2000;
    }
}

class ItemPrinter implements java.util.function.Consumer<Item> {
    public void accept(Item i) {
        System.out.println(i.name + " | Price: " + i.price);
    }
}
