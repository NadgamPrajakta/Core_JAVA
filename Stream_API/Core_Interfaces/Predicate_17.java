package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_17 {

    Predicate<Integer> predicate;

    public Predicate_17() {
        Predicate<Integer> custom = new GreaterThan10Predicate();
        Predicate<Integer> lambda = n -> n < 20;

        predicate = custom.and(lambda);
    }

    public static void main(String[] args) {
        Predicate_17 obj = new Predicate_17();
        System.out.println(obj.predicate.test(15));
        System.out.println(obj.predicate.test(25));
    }
}


class GreaterThan10Predicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer num) {
        return num > 10;
    }
}