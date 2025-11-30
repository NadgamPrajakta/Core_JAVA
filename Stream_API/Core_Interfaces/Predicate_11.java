package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_11 {

	public static void main(String[] args) {
		
		Check_Number_range obj = new Check_Number_range(50);
        System.out.println("Override test(): " + obj.test(obj.num));

        Predicate<Integer> inRange = x -> x >= 1 && x <= 100;
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println("OR: " + inRange.or(isEven).test(120));
        System.out.println("AND: " + inRange.and(isEven).test(40));
        System.out.println("NEGATE: " + inRange.negate().test(150));

	}

}


class Check_Number_range implements Predicate<Integer> {

     int num;

    public Check_Number_range(int num) {
        this.num = num;
    }

    @Override
    public boolean test(Integer n) {
        return n >= 1 && n <= 100;
    }
}

