package misc2;

import java.util.*;

public class flatMap_2 {

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(10, 20);
        List<Integer> b = Arrays.asList(30, 40);
        List<Integer> c = Arrays.asList(50, 60);

        List<List<Integer>> l1 = Arrays.asList(a, b);
        List<List<Integer>> l2 = Arrays.asList(c);

        List<List<List<Integer>>> mainList = Arrays.asList(l1, l2);

        int max = mainList.stream()
                          .flatMap(i -> i.stream())
                          .flatMap(j -> j.stream())
                          .max(Integer::compareTo)
                          .get();

        System.out.println("Max value = " + max);
    }
}
