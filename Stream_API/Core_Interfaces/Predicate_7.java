package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_7 {

	public static void main(String[] args) {
		
		String_Contains_Digit obj = new String_Contains_Digit("abc123");
        System.out.println("Override test(): " + obj.test(obj.input));

        Predicate<String> containsDigit = x -> x.matches(".*\\d.*");
        Predicate<String> longString = x -> x.length() > 5;

        System.out.println("OR: " + containsDigit.or(longString).test("hello"));
        System.out.println("AND: " + containsDigit.and(longString).test("welcome1"));
        System.out.println("NEGATE: " + containsDigit.negate().test("hello"));

	}

}


class String_Contains_Digit implements Predicate<String> {

    String input;

    public String_Contains_Digit(String input) {
        this.input = input;
    }

    @Override
    public boolean test(String s) {
        return s.matches(".*\\d.*");
    }
}
