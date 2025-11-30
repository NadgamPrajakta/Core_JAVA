package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;

public class Custom_13 {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Hyderabad");
        cities.add("Chennai");

        cities.stream()
            .skip(2)
            .forEach(new CityPrinter());
    }
}

class CityPrinter implements java.util.function.Consumer<String> {
    public void accept(String t) {
        System.out.println("After Skip: " + t);
    }
}
