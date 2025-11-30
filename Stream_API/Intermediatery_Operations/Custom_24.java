package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;

public class Custom_24 {

    public static void main(String[] args) {

        List<Integer> ratings = new ArrayList<>();
        ratings.add(1);
        ratings.add(2);
        ratings.add(5);
        ratings.add(4);
        ratings.add(3);

        ratings.stream()
            .sorted()
            .skip(2)
            .forEach(new RatingPrinter());
    }
}

class RatingPrinter implements java.util.function.Consumer<Integer> {
    public void accept(Integer r) {
        System.out.println("Rating Considered: " + r);
    }
}
