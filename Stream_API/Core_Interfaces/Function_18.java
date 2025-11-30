package coreInterfaces;

import java.util.function.Function;

public class Function_18 {

    Function<String, String> func;

    public Function_18() {
        Function<String, String> custom = new TrimFunction();
        func = custom;
    }

    public static void main(String[] args) {
    	Function_18 obj = new Function_18();
        System.out.println(obj.func.apply("Java Function Example"));
    }
}


class TrimFunction implements Function<String, String> {
    @Override
    public String apply(String s) {
        return s.replace(" ", "");
    }
}
