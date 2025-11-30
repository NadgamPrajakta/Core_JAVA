package coreInterfaces;

import java.util.function.Function;

public class Function_13 {

    Function<String, String> func;

    public Function_13() {
        Function<String, String> custom = new ReverseFunction();
        func = custom.andThen(str -> "Reversed => " + str);
    }

    public static void main(String[] args) {
    	Function_13 obj = new Function_13();
        System.out.println(obj.func.apply("Function"));
    }
}


class ReverseFunction implements Function<String, String> {
    @Override
    public String apply(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}