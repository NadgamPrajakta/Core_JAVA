package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class UpperCaseCollector_1 {

    public static void main(String[] args) {

        List<String> result =
                List.of("java","stream","api", "welcome", "to", "prajkta")
                .stream()
                .collect(new UpperCaseCollector());

        System.out.println(result);
    }
}

class UpperCaseCollector implements Collector<String, List<String>, List<String>> {

    public Supplier<List<String>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<String>, String> accumulator() {
        return (list, s) -> list.add(s.toUpperCase());
    }

    public BinaryOperator<List<String>> combiner() {
        return (a, b) -> { a.addAll(b); return a; };
    }

    public Function<List<String>, List<String>> finisher() {
        return Function.identity();
    }

    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH);
    }
}
