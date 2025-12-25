package listif;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(40);
		list.add(70);
		list.add(60);
		list.add(80);
		list.add(90);
		list.add(2, 22);
		
		System.out.println(list);   // add(Index based)
		
	}

}
