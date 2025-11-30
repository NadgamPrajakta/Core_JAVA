package coreInterfaces;

import java.util.function.Function;

public class Function_17 {

    Function<Double, Double> func;

    public Function_17() {
        Function<Double, Double> custom = new TempFunction();
        func = custom;
    }

    public static void main(String[] args) {
    	Function_17 obj = new Function_17();
        System.out.println(obj.func.apply(98.6));
    }
}


class TempFunction implements Function<Double, Double> {
    @Override
    public Double apply(Double f) {
        return (f - 32) * 5 / 9;
    }
}