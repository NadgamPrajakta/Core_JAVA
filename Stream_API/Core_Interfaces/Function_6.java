package coreInterfaces;

import java.util.function.Function;

public class Function_6 {

    Function<Integer, Integer> func;

    public Function_6() {
    	Function<Integer, Integer> custom = new SquareFunction();
        Function<Integer, Integer> lambda = n -> n + 5;

        func = custom.andThen(lambda);
    }

    public static void main(String[] args) {
    	Function_6 obj = new Function_6();
        System.out.println(obj.func.apply(6));
    }
}


class SquareFunction implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer n) {
        return n * n;
    }
}