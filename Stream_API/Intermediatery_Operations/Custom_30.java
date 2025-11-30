package intermediatary_ops;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Custom_30 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Rita", "Soham", "Avi", "Prajkta", "Neha");

		names.stream()
			.sorted(new DescendingSort())
			.forEach(new PrintName28());
	}
}

class DescendingSort implements Comparator<String> {

	public int compare(String a, String b) {
		return b.compareTo(a); 
	}
}

class PrintName28 implements Consumer<String> {

	public void accept(String t) {
		System.out.println("Name: " + t);
	}
}
