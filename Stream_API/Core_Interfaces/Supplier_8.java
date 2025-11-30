package coreInterfaces;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier_8 {

    Supplier<Boolean> supplier;

    public Supplier_8() {
        Supplier<Boolean> custom = new RandomBooleanSupplier();
        Supplier<Boolean> lambda = () -> new Random().nextBoolean();

//        supplier = custom.or(() -> lambda.get());
    }

    public static void main(String[] args) {
    	Supplier_8 obj = new Supplier_8();
        System.out.println("Boolean Output: " + obj.supplier.get());
    }
}


class RandomBooleanSupplier implements Supplier<Boolean> {

    @Override
    public Boolean get() {
        return new Random().nextBoolean();
    }
}