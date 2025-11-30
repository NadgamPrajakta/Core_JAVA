package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Custom_14 {

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();
        marks.add(92);
        marks.add(75);
        marks.add(63);
        marks.add(50);

        marks.stream()
            .map(new GradeMapper())
            .forEach(new GradePrinter());
    }
}

class GradeMapper implements Function<Integer, String> {

    public String apply(Integer m) {
        if (m >= 90) return "A";
        if (m >= 75) return "B";
        if (m >= 60) return "C";
        return "D";
    }
}

class GradePrinter implements java.util.function.Consumer<String> {
    public void accept(String t) {
        System.out.println("Grade: " + t);
    }
}
