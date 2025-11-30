package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_16 {

    Predicate<String> predicate;

    public Predicate_16() {
        Predicate<String> custom = new ContainsJavaPredicate();
        predicate = custom.negate(); // reverse output
    }

    public static void main(String[] args) {
        Predicate_16 obj = new Predicate_16();
        System.out.println(obj.predicate.test("Java Programming"));
        System.out.println(obj.predicate.test("Python Language"));
    }
}


class ContainsJavaPredicate implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.contains("Java");
    }
}