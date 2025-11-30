package coreInterfaces;

import java.util.function.Supplier;

public class Supplier_9 {

    Supplier<String> supplier;

    public Supplier_9() {
        Supplier<String> custom = new GreetingSupplier();
        Supplier<String> lambda = () -> "Hello from Lambda!";

        supplier = () -> custom.get() + " | " + lambda.get();
    }

    public static void main(String[] args) {
    	Supplier_9 obj = new Supplier_9();
        System.out.println(obj.supplier.get());
    }
}


class GreetingSupplier implements Supplier<String> {

    @Override
    public String get() {
        return "Welcome to Java Supplier!";
    }
}