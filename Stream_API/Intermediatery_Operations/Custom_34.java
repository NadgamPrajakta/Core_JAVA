package intermediatary_ops;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Custom_34 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Prajkta", "Aditi", "Kiran", "Rohit");

		names.stream()
			.sorted(new SortByLength())
			.forEach(new PrintName());
	}
}

class SortByLength implements Comparator<String> {

	public int compare(String a, String b) {
		return a.length() - b.length();
	}
}

class PrintName implements Consumer<String> {

	public void accept(String t) {
		System.out.println("Name: " + t);
	}
}
