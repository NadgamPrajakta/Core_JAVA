package coreInterfaces;

import java.util.function.Supplier;

public class Supplier_7 {

    Supplier<String> supplier;

    public Supplier_7() {

        Supplier<String> custom = new DefaultUserSupplier();

        Supplier<String> lambda = () -> "LambdaUser456";

        supplier = lambda;
    }

    public static void main(String[] args) {
    	Supplier_7 obj = new Supplier_7();
        System.out.println("Username: " + obj.supplier.get());
    }
}


class DefaultUserSupplier implements Supplier<String> {
    @Override
    public String get() {
        return "CustomUser123";
    }
}