package coreInterfaces;

import java.util.function.Supplier;

public class Supplier_2 {

    Supplier<Integer> supplier;

    public Supplier_2() {

        Supplier<Integer> custom = new RandomNumberSupplier();

        Supplier<Integer> lambda = () -> (int)(Math.random() * 50);

        // Using lambda as final supplier
        supplier = lambda;  
    }

    public static void main(String[] args) {
    	Supplier_2 obj = new Supplier_2();
        System.out.println("Random Number: " + obj.supplier.get());
    }
}


class RandomNumberSupplier implements Supplier<Integer> {
    @Override
    public Integer get() {
        return (int)(Math.random() * 100);
    }
}