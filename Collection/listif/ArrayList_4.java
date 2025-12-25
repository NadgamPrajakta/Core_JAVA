package listif;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_4 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Dog");
		list.add("Cat");
		list.add("Tiger");
		list.add("Lion");
		list.add("elephant");
		list.add("giraffe");
		list.add("monkey");
		list.add("Rabbit");
		list.add("Hamster");
		list.add("Horse");
		
		System.out.println(list);
		
		System.out.println("Elemets at Index: " + list.set(4, "Kangaroo"));

	}

}
