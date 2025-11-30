package coreInterfaces;

import java.util.function.Function;

public class Function_15 {

    Function<String, Integer> func;

    public Function_15() {
        Function<String, Integer> custom = new WordCountFunction();
        func = custom;
    }

    public static void main(String[] args) {
    	Function_15 obj = new Function_15();
        System.out.println(obj.func.apply("AI is the future"));
    }
}


class WordCountFunction implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.split(" ").length;
    }
}