package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;

public class Custom_12 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.stream()
            .limit(3)
            .forEach(new LimitedPrinter());
    }
}

class LimitedPrinter implements java.util.function.Consumer<Integer> {
    public void accept(Integer t) {
        System.out.println("Limited Output = " + t);
    }
}
