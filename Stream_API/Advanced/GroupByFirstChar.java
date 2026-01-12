package advanced;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByFirstChar {

    public static void main(String[] args) {

        Map<Character, List<String>> map =
                List.of("apple","banana","apricot","blueberry")
                .stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(map);
    }
}
