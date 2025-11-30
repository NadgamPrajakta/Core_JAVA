package coreInterfaces;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier_17 {

    Supplier<String> supplier;

    public Supplier_17() {
        Supplier<String> custom = new PasswordSupplier();
        Supplier<String> lambda = () -> "Lambda Password: XYZ123";

        supplier = custom;
    }

    public static void main(String[] args) {
    	Supplier_17 obj = new Supplier_17();
        System.out.println(obj.supplier.get());
    }
}


class PasswordSupplier implements Supplier<String> {

    @Override
    public String get() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            sb.append(chars.charAt(r.nextInt(chars.length())));
        }
        return "Password: " + sb;
    }
}
