package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_6 {

	public static void main(String[] args) {
		
		 Non_Empty obj = new Non_Empty("Hello");
	        System.out.println("Override test(): " + obj.test(obj.text));

	        Predicate<String> notEmpty = x -> !x.isEmpty();
	        Predicate<String> startsWithA = x -> x.startsWith("A");

	        System.out.println("OR: " + notEmpty.or(startsWithA).test(""));
	        System.out.println("AND: " + notEmpty.and(startsWithA).test("Apple"));
	        System.out.println("NEGATE: " + notEmpty.negate().test(""));
	}

}


class Non_Empty implements Predicate<String> {

    String text;

    public Non_Empty(String text) {
        this.text = text;
    }

    @Override
    public boolean test(String s) {
        return s != null && !s.isEmpty();
    }
}

