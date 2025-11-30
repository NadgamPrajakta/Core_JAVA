package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_18 {

    Predicate<String> predicate;

    public Predicate_18() {
        Predicate<String> custom = new EndsWithNPredicate();
        Predicate<String> lambda = s -> s.length() < 5;

        predicate = custom.or(lambda);
    }

    public static void main(String[] args) {
        Predicate_18 obj = new Predicate_18();
        System.out.println(obj.predicate.test("John"));
        System.out.println(obj.predicate.test("Max"));
        System.out.println(obj.predicate.test("Prajkta"));
    }
}


class EndsWithNPredicate implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.endsWith("n");
    }
}