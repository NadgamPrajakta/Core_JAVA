package coreInterfaces;

import java.util.function.Function;

public class Function_19 {

    Function<Integer, String> func;

    public Function_19() {
        Function<Integer, String> custom = new BinaryFunction();
        func = custom.andThen(str -> "Binary: " + str);
    }

    public static void main(String[] args) {
    	Function_19 obj = new Function_19();
        System.out.println(obj.func.apply(15));
    }
}


class BinaryFunction implements Function<Integer, String> {
    @Override
    public String apply(Integer n) {
        return Integer.toBinaryString(n);
    }
}