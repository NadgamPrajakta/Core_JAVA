package intermediatary_ops;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Custom_32 {

	public static void main(String[] args) {

		List<String> cities = Arrays.asList(
				"mumbai", "pune", "delhi", "pune", "nagpur", "mumbai"
		);

		cities.stream()
			.map(new Capitalizer())
			.distinct()
			.forEach(new PrintCity());
	}
}

class Capitalizer implements Function<String, String> {

	public String apply(String t) {
		return t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase();
	}
}

class PrintCity implements Consumer<String> {

	public void accept(String t) {
		System.out.println("City: " + t);
	}
}
