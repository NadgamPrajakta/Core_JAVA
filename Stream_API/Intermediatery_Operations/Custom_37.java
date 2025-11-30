package intermediatary_ops;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Custom_37 {

	public static void main(String[] args) {

		List<List<String>> data = Arrays.asList(
				Arrays.asList("Java", "Python"),
				Arrays.asList("HTML", "CSS"),
				Arrays.asList("React", "Node")
		);

		data.stream()
			.flatMap(list -> list.stream())
			.forEach(new TechPrinter());
	}
}

class TechPrinter implements Consumer<String> {

	public void accept(String t) {
		System.out.println("Tech: " + t);
	}
}
