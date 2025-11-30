package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Custom_9 {

    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();
        data.add(2);
        data.add(4);
        data.add(6);
        data.add(7);
        data.add(8);

        data.stream()
            .takeWhile(new MyTakeCondition())
            .forEach(new PrintTakenValues());
    }
}

class MyTakeCondition implements Predicate<Integer> {
    public boolean test(Integer t) {
        return t % 2 == 0;  // take numbers until odd appears
    }
}

class PrintTakenValues implements java.util.function.Consumer<Integer> {
    public void accept(Integer t) {
        System.out.println("Taken: " + t);
    }
}
