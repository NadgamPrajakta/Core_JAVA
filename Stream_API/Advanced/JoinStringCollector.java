package advanced;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class JoinStringCollector {

    public static void main(String[] args) {

        String result =
                List.of("abcdefg","efhgkto","xyzpoknm", "klmp", "opnr")
                .stream()
                .collect(new JoinCollector());

        System.out.println(result);
    }
}

class JoinCollector implements Collector<String, StringBuilder, String> {

    public Supplier<StringBuilder> supplier() {
        return StringBuilder::new;
    }

    public BiConsumer<StringBuilder, String> accumulator() {
        return (sb, s) -> sb.append(s).append("-");
    }

    public BinaryOperator<StringBuilder> combiner() {
        return StringBuilder::append;
    }

    public Function<StringBuilder, String> finisher() {
        return sb -> sb.substring(0, sb.length()-1);
    }

    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
