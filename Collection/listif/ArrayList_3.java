package listif;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Red");
		list.add("Blue");
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Pink");
		list.add("Orange");
		list.add("Purple");
		list.add("Violet.");
		list.add("Turquoise");
		list.add("Gray");
		list.add("Maroon");
		
		System.out.println(list);
		
		System.out.println("Element at index 4: " + list.get(4));

	}

}
