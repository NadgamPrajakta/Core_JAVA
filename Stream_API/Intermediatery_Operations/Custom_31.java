package intermediatary_ops;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Custom_31 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
				new Person("Amit", Arrays.asList("Reading", "Cricket")),
				new Person("Neha", Arrays.asList("Dancing", "Singing")),
				new Person("Rohan", Arrays.asList("Gaming", "Coding"))
		);

		persons.stream()
			.flatMap(p -> p.hobbies.stream())
			.forEach(new HobbyPrinter());
	}
}

class Person {
	String name;
	List<String> hobbies;

	Person(String name, List<String> hobbies) {
		this.name = name;
		this.hobbies = hobbies;
	}
}

class HobbyPrinter implements Consumer<String> {

	public void accept(String t) {
		System.out.println("Hobby: " + t);
	}
}
