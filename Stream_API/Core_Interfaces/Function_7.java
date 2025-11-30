package coreInterfaces;

import java.util.function.Function;

public class Function_7 {

    Function<String, String> func;

    public Function_7() {
        Function<String, String> custom = new UpperCaseFunction();
        func = custom.andThen(str -> "Formatted: " + str);
    }

    public static void main(String[] args) {
    	Function_7 obj = new Function_7();
        System.out.println(obj.func.apply("welcome to uss & full stack java development"));
    }
}


class UpperCaseFunction implements Function<String, String> {
    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}
