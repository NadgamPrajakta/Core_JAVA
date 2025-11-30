package coreInterfaces;

import java.util.function.Function;

public class Function_5 {

    Function<Integer, String> func;

    public Function_5() {
        Function<Integer, String> custom = new IntToStringFunction();
        Function<Integer, String> lambda = n -> "Double: " + (n * 2);

        func = custom.andThen(s -> s + " | Processed");
    }

    public static void main(String[] args) {
    	Function_5 obj = new Function_5();
        System.out.println(obj.func.apply(10));
    }
}


class IntToStringFunction implements Function<Integer, String> {

    @Override
    public String apply(Integer n) {
        return "Number: " + n;
    }
}