package intermediatary_ops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Custom_23 {

    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>();
        scores.add(88);
        scores.add(95);
        scores.add(70);
        scores.add(99);
        scores.add(84);

        scores.stream()
            .sorted(new ScoreSorterDesc())
            .limit(3)
            .forEach(new ScorePrinter());
    }
}

class ScoreSorterDesc implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

class ScorePrinter implements java.util.function.Consumer<Integer> {
    public void accept(Integer t) {
        System.out.println("Top Score: " + t);
    }
}
