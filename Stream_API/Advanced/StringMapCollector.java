package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class StringMapCollector {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> map =
                List.of("Java","Stream","Collector")
                .stream()
                .collect(new LengthStringMapCollector());

        System.out.println(map);
    }
}

class LengthStringMapCollector implements Collector<String, LinkedHashMap<Integer,String>, LinkedHashMap<Integer,String>> {

    public Supplier<LinkedHashMap<Integer, String>> supplier() {
        return LinkedHashMap::new;
    }

    public BiConsumer<LinkedHashMap<Integer, String>, String> accumulator() {
        return (map, s) -> map.put(s.length(), s);
    }

    public BinaryOperator<LinkedHashMap<Integer, String>> combiner() {
        return (a, b) -> { a.putAll(b); return a; };
    }

    public Function<LinkedHashMap<Integer, String>, LinkedHashMap<Integer, String>> finisher() {
        return Function.identity();
    }

    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH);
    }
}
