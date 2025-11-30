package coreInterfaces;

import java.util.function.Supplier;

public class Supplier_15 {

    Supplier<String> supplier;

    public Supplier_15() {
        Supplier<String> custom = new OTPSuppliers();
        Supplier<String> lambda = () -> "Lambda OTP: " + ((int)(Math.random() * 9000) + 1000);

        supplier = custom;
    }

    public static void main(String[] args) {
    	Supplier_15 obj = new Supplier_15();
        System.out.println(obj.supplier.get());
    }
}


class OTPSuppliers implements Supplier<String> {

    @Override
    public String get() {
        int otp = (int)(Math.random() * 9000) + 1000;
        return "OTP: " + otp;
    }
}