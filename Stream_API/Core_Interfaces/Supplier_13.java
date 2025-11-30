package coreInterfaces;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier_13 {

    Supplier<String> supplier;

    public Supplier_13() {
        Supplier<String> custom = new ColorSupplier();
        Supplier<String> lambda = () -> "Lambda Color: Orange";

        supplier = () -> custom.get();
    }

    public static void main(String[] args) {
    	Supplier_13 obj = new Supplier_13();
        System.out.println("Selected Color: " + obj.supplier.get());
    }
}


class ColorSupplier implements Supplier<String> {

    String[] colors = {"Red", "Green", "Blue", "Yellow", "Black", "White"};

    @Override
    public String get() {
        return colors[new Random().nextInt(colors.length)];
    }
}