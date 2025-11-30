package coreInterfaces;

import java.util.function.Function;

public class Function_9 {

    Function<Integer, Integer> func;

    public Function_9() {
        Function<Integer, Integer> custom = new CubeFunction();
        func = custom.andThen(n -> n - 5);
    }

    public static void main(String[] args) {
    	Function_9 obj = new Function_9();
        System.out.println(obj.func.apply(3));
    }
}


class CubeFunction implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer n) {
        return n * n * n;
    }
}