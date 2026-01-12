package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class UniqueStringCollector_1 {

    public static void main(String[] args) {

        Set<String> set =
                List.of("Java","Java","Stream","API","API")
                .stream()
                .collect(new UniqueStringCollector());

        System.out.println(set);
    }
}

class UniqueStringCollector implements Collector<String, Set<String>, Set<String>> {

    public Supplier<Set<String>> supplier() {
        return HashSet::new;
    }

    public BiConsumer<Set<String>, String> accumulator() {
        return Set::add;
    }

    public BinaryOperator<Set<String>> combiner() {
        return (a, b) -> { a.addAll(b); return a; };
    }

    public Function<Set<String>, Set<String>> finisher() {
        return Function.identity();
    }

    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH);
    }
}
