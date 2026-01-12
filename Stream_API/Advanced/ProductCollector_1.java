package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class ProductCollector_1{
	
    public static void main(String[] args) {
    	
        Integer product = List.of(10, 20, 30, 40, 45, 67, 43, 23, 60)
                .stream()
                .collect(new ProductCollector());

        System.out.println("Product = " + product);
    }
}

class ProductCollector implements Collector<Integer, List<Integer>, Integer> {

    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    public BiConsumer<List<Integer>, Integer> accumulator() {
        return List::add;
    }

    public BinaryOperator<List<Integer>> combiner() {
        return (a, b) -> {
            a.addAll(b);
            return a;
        };
    }

    public Function<List<Integer>, Integer> finisher() {
        return list -> {
            int product = 1;
            for (int i : list) product *= i;
            return product;
        };
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
