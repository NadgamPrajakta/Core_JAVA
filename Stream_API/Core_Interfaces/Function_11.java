package coreInterfaces;

import java.util.function.Function;

public class Function_11 {

    Function<Integer, Boolean> func;

    public Function_11() {
        Function<Integer, Boolean> custom = new EvenFunction();
        func = custom.andThen(b -> !b);
    }

    public static void main(String[] args) {
    	Function_11 obj = new Function_11();
        System.out.println(obj.func.apply(10));
    }
}


class EvenFunction implements Function<Integer, Boolean> {
    @Override
    public Boolean apply(Integer n) {
        return n % 2 == 0;
    }
}
