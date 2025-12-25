package listif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_5 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(Arrays.asList());
		
		list.add("Pen");
		list.add("Pencil");
		list.add("Paper");
		list.add("Staplers");
		list.add("Highlighters");
		list.add("Notebooks");
		list.add("Whiteboards ");
		list.add("Markers");
		list.add("sharpeners");
		list.add("rulers");
		
		list.remove(4);
		list.remove("Notebooks");
		
		System.out.println(list);



	}

}
