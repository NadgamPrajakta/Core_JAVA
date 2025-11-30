package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_4 {

	public static void main(String[] args) {
		
		 EvenNumber obj = new EvenNumber(10);
	        System.out.println("Override test(): " + obj.test(obj.value));

	        Predicate<Integer> isEven = x -> x % 2 == 0;
	        Predicate<Integer> greaterThan5 = x -> x > 5;

	        // Using OR
	        System.out.println("OR: " + isEven.or(greaterThan5).test(3));

	        // Using AND
	        System.out.println("AND: " + isEven.and(greaterThan5).test(10));

	        // Using NEGATE
	        System.out.println("NEGATE: " + isEven.negate().test(4));
	}

}


class EvenNumber implements Predicate<Integer> {

    int value;

    // Constructor
    public EvenNumber(int value) {
        this.value = value;
    }

    // Overriding test()
    @Override
    public boolean test(Integer n) {
        return n % 2 == 0;
    }
}
