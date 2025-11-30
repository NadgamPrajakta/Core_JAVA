package coreInterfaces;

import java.util.function.Supplier;

public class Supplier_6 {

    Supplier<Character> supplier;

    public Supplier_6() {

        Supplier<Character> custom = new CharacterSupplier();

        Supplier<Character> lambda = () -> (char)('a' + (int)(Math.random() * 26));

        supplier = lambda;
    }

    public static void main(String[] args) {
    	Supplier_6 obj = new Supplier_6();
        System.out.println("Generated Character: " + obj.supplier.get());
    }
}


class CharacterSupplier implements Supplier<Character> {
    @Override
    public Character get() {
        return (char)('A' + (int)(Math.random() * 26));
    }
}
