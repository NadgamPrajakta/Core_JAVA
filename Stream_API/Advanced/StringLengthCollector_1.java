package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class StringLengthCollector_1 {

    public static void main(String[] args) {

        List<Integer> lengths =
                List.of("Java","Stream","API","Collector", "Python", "Javascript")
                .stream()
                .collect(new StringLengthCollector());

        System.out.println(lengths);
    }
}

class StringLengthCollector implements Collector<String, List<Integer>, List<Integer>> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, String> accumulator() {
        return (list, s) -> list.add(s.length());
    }

    public BinaryOperator<List<Integer>> combiner() {
        return (l1, l2) -> { l1.addAll(l2); return l1; };
    }

    public Function<List<Integer>, List<Integer>> finisher() {
        return Function.identity();
    }

    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH);
    }
}
