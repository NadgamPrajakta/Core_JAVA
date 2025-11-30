package coreInterfaces;

import java.util.function.Function;

public class Function_14 {

    Function<Integer, Double> func;

    public Function_14() {
        Function<Integer, Double> custom = new SqrtFunction();
        func = custom.compose(n -> n * 10);
    }

    public static void main(String[] args) {
    	Function_14 obj = new Function_14();
        System.out.println(obj.func.apply(4));
    }
}


class SqrtFunction implements Function<Integer, Double> {
    @Override
    public Double apply(Integer n) {
        return Math.sqrt(n);
    }
}