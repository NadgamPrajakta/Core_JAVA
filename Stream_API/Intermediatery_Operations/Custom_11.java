package intermediatary_ops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Custom_11 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Prajakta");
        names.add("Akshay");
        names.add("Zara");
        names.add("Meera");

        names.stream()
            .sorted(new CustomNameSort())
            .forEach(new PrintNameSorted());
    }
}

class CustomNameSort implements Comparator<String> {
    public int compare(String o1, String o2) {
        return o1.length() - o2.length(); // sort by length
    }
}

class PrintNameSorted implements java.util.function.Consumer<String> {
    public void accept(String t) {
        System.out.println("Sorted: " + t);
    }
}
