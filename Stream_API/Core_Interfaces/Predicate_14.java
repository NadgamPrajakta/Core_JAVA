package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_14 {

    Predicate<Integer> predicate;

    public Predicate_14() {
        Predicate<Integer> custom = new NegativePredicate();
        Predicate<Integer> lambda = n -> n % 2 == 0;

        predicate = custom.or(lambda);
    }

    public static void main(String[] args) {
        Predicate_14 obj = new Predicate_14();
        System.out.println(obj.predicate.test(-5));
        System.out.println(obj.predicate.test(4));
        System.out.println(obj.predicate.test(7));
    }
}


class NegativePredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer num) {
        return num < 0;
    }
}