package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class CountLongStrings {

    public static void main(String[] args) {

        Integer count =
                List.of("Java","Stream","Collector","API", "ABC", "cde", "psr", "potrfgkh")
                .stream()
                .collect(new LongStringCountCollector());

        System.out.println("Count = " + count);
    }
}

class LongStringCountCollector implements Collector<String, List<String>, Integer> {

    public Supplier<List<String>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<String>, String> accumulator() {
        return (list, s) -> {
            if(s.length() > 4) list.add(s);
        };
    }

    public BinaryOperator<List<String>> combiner() {
        return (a,b)->{ a.addAll(b); return a; };
    }

    public Function<List<String>, Integer> finisher() {
        return List::size;
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
