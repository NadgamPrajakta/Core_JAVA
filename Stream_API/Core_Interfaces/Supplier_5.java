package coreInterfaces;

import java.util.function.Supplier;

public class Supplier_5 {

    Supplier<String> supplier;

    public Supplier_5() {

        Supplier<String> custom = new OTPSupplier();

        Supplier<String> lambda = () -> {
            int otp = 1000 + (int)(Math.random() * 9000);
            return "Lambda OTP: " + otp;
        };

        supplier = lambda;
    }

    public static void main(String[] args) {
    	Supplier_5 obj = new Supplier_5();
        System.out.println(obj.supplier.get());
    }
}


class OTPSupplier implements Supplier<String> {
    @Override
    public String get() {
        int otp = 100000 + (int)(Math.random() * 900000);
        return "Custom OTP: " + otp;
    }
}