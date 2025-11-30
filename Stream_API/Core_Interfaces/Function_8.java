package coreInterfaces;

import java.util.function.Function;

public class Function_8 {

    Function<String, Integer> func;

    public Function_8() {
        Function<String, Integer> custom = new LengthFunction();
        func = custom.andThen(n -> n + 10);
    }

    public static void main(String[] args) {
    	Function_8 obj = new Function_8();
        System.out.println(obj.func.apply("Prajkta"));
    }
}


class LengthFunction implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}