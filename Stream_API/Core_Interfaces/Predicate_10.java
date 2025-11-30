package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_10 {

	public static void main(String[] args) {
		
		String_Length obj = new String_Length("Welcome");
        System.out.println("Override test(): " + obj.test(obj.text));

        Predicate<String> longStr = x -> x.length() > 5;
        Predicate<String> startsWithH = x -> x.startsWith("H");

        System.out.println("OR: " + longStr.or(startsWithH).test("Hi"));
        System.out.println("AND: " + longStr.and(startsWithH).test("HelloWorld"));
        System.out.println("NEGATE: " + longStr.negate().test("Java"));

	}

}


class String_Length implements Predicate<String> {

     String text;

    public String_Length(String text) {
        this.text = text;
    }

    @Override
    public boolean test(String s) {
        return s.length() > 5;
    }
}
