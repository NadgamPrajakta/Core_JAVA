package coreInterfaces;

import java.time.LocalTime;
import java.util.function.Supplier;

public class Supplier_3 {

    Supplier<String> supplier;

    public Supplier_3() {

        Supplier<String> custom = new TimeSupplier();

        Supplier<String> lambda = () -> "Time Now: " + LocalTime.now();

        supplier = lambda;  
    }

    public static void main(String[] args) {
    	Supplier_3 obj = new Supplier_3();
        System.out.println(obj.supplier.get());
    }
}


class TimeSupplier implements Supplier<String> {
    @Override
    public String get() {
        return LocalTime.now().toString();
    }
}