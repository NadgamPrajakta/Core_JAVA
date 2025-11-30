package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_12 {

	public static void main(String[] args) {
		
		Check_String_Alphabets obj = new Check_String_Alphabets("Hello");
        System.out.println("Override test(): " + obj.test(obj.text));

        Predicate<String> alphabetsOnly = x -> x.matches("[a-zA-Z]+");
        Predicate<String> lenGreaterThan3 = x -> x.length() > 3;

        System.out.println("OR: " + alphabetsOnly.or(lenGreaterThan3).test("123"));
        System.out.println("AND: " + alphabetsOnly.and(lenGreaterThan3).test("Java"));
        System.out.println("NEGATE: " + alphabetsOnly.negate().test("Hello123"));

	}

}


class Check_String_Alphabets implements Predicate<String> {

     String text;

    public Check_String_Alphabets(String text) {
        this.text = text;
    }

    @Override
    public boolean test(String s) {
        return s.matches("[a-zA-Z]+");
    }
}
