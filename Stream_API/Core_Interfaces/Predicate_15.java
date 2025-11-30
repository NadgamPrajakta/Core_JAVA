package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_15 {

    Predicate<Integer> predicate;

    public Predicate_15() {
        Predicate<Integer> custom = new AdultPredicate();
        Predicate<Integer> lambda = a -> a < 60;

        predicate = custom.and(lambda);
    }

    public static void main(String[] args) {
        Predicate_15 obj = new Predicate_15();
        System.out.println(obj.predicate.test(25));
        System.out.println(obj.predicate.test(65));
        System.out.println(obj.predicate.test(17));
    }
}


class AdultPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer age) {
        return age >= 18;
    }
}