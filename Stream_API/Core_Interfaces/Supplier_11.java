package coreInterfaces;

import java.util.function.Supplier;

public class Supplier_11 {

    Supplier<Long> supplier;

    public Supplier_11() {
        Supplier<Long> custom = new TimeSuppliers();
        Supplier<Long> lambda = () -> System.nanoTime();

        supplier = custom;
    }

    public static void main(String[] args) {
    	Supplier_11 obj = new Supplier_11();
        System.out.println("Current Time (ms): " + obj.supplier.get());
    }
}


class TimeSuppliers implements Supplier<Long> {

    @Override
    public Long get() {
        return System.currentTimeMillis();
    }
}
