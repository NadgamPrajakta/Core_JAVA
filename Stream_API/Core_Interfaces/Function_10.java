package coreInterfaces;

import java.util.function.Function;

public class Function_10 {

    Function<String, Character> func;

    public Function_10() {
        Function<String, Character> custom = new FirstCharFunction();
        func = custom;
    }

    public static void main(String[] args) {
    	Function_10 obj = new Function_10();
        System.out.println(obj.func.apply("ChatGPT"));
    }
}


class FirstCharFunction implements Function<String, Character> {
    @Override
    public Character apply(String s) {
        return s.charAt(0);
    }
}