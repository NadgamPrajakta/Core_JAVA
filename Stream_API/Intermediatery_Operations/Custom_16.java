package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Custom_16 {

    public static void main(String[] args) {

        List<String> batch1 = List.of("Amit", "Prajkta");
        List<String> batch2 = List.of("Bob", "Charlie");
        List<String> batch3 = List.of("John", "Alia");

        List<List<String>> allBatches = new ArrayList<>();
        allBatches.add(batch1);
        allBatches.add(batch2);
        allBatches.add(batch3);

        allBatches.stream()
            .flatMap(new BatchFlattener())
            .forEach(new StudentNamePrinter());
    }
}

class BatchFlattener implements Function<List<String>, java.util.stream.Stream<String>> {
    public java.util.stream.Stream<String> apply(List<String> t) {
        return t.stream();
    }
}

class StudentNamePrinter implements java.util.function.Consumer<String> {
    public void accept(String t) {
        System.out.println("Student Name: " + t);
    }
}
