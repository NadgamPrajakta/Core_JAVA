package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Custom_8 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(8);
        nums.add(12);
        nums.add(3);
        nums.add(25);
        nums.add(30);

        nums.stream()
            .dropWhile(new DropCondition())
            .forEach(new ProcessDropData());
    }
}

class DropCondition implements Predicate<Integer> {
    public boolean test(Integer t) {
        return t < 10; // drop until condition false
    }
}

class ProcessDropData implements java.util.function.Consumer<Integer> {
    public void accept(Integer t) {
        System.out.println("After dropWhile: " + t);
    }
}
