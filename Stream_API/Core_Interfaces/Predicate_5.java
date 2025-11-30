package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_5 {

	public static void main(String[] args) {
		
		PositiveNo obj = new PositiveNo(5);
        System.out.println("Override test(): " + obj.test(obj.num));

        Predicate<Integer> isPositive = x -> x > 0;
        Predicate<Integer> lessThan100 = x -> x < 100;

        System.out.println("OR: " + isPositive.or(lessThan100).test(-5));
        System.out.println("AND: " + isPositive.and(lessThan100).test(50));
        System.out.println("NEGATE: " + isPositive.negate().test(10));

	}

}


class PositiveNo implements Predicate<Integer> {

     int num;

    public PositiveNo(int num) {
        this.num = num;
    }

    @Override
    public boolean test(Integer n) {
        return n > 0;
    }
}
