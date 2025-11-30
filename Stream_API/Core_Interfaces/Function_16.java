package coreInterfaces;

import java.util.function.Function;

public class Function_16 {

    Function<Double, Double> func;

    public Function_16() {
        Function<Double, Double> custom = new DiscountFunction();
        func = custom.andThen(p -> p - 50);
    }

    public static void main(String[] args) {
    	Function_16 obj = new Function_16();
        System.out.println(obj.func.apply(500.0));
    }
}


class DiscountFunction implements Function<Double, Double> {
    @Override
    public Double apply(Double price) {
        return price * 0.90;
    }
}

