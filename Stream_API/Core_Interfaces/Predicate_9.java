package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_9 {

	public static void main(String[] args) {
		
		Odd_No obj = new Odd_No(7);
        System.out.println("Override test(): " + obj.test(obj.number));

        Predicate<Integer> isOdd = x -> x % 2 != 0;
        Predicate<Integer> isGreaterThan10 = x -> x > 10;

        System.out.println("OR: " + isOdd.or(isGreaterThan10).test(12));
        System.out.println("AND: " + isOdd.and(isGreaterThan10).test(15));
        System.out.println("NEGATE: " + isOdd.negate().test(3));
	}

}


class Odd_No implements Predicate<Integer> {

     int number;

    public Odd_No(int number) {
        this.number = number;
    }

    @Override
    public boolean test(Integer n) {
        return n % 2 != 0;
    }
}
