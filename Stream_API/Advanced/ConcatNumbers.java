package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class ConcatNumbers {
	
    public static void main(String[] args) {
    	
        String result = List.of(1, 2, 3, 4, 8, 9, 65, 43, 12, 23)
                .stream()
                .collect(new ConcatCollector());

        System.out.println("Concatenated = " + result);
    }
}

class ConcatCollector implements Collector<Integer, StringBuilder, String> {

    public Supplier<StringBuilder> supplier() {
        return StringBuilder::new;
    }

    public BiConsumer<StringBuilder, Integer> accumulator() {
        return StringBuilder::append;
    }

    public BinaryOperator<StringBuilder> combiner() {
        return (a, b) -> a.append(b);
    }

    public Function<StringBuilder, String> finisher() {
        return StringBuilder::toString;
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
