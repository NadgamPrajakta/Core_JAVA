package custom_map_if;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Eight {

	public static void main(String[] args) {
		
		HashMap<String, List<Marks>> map = new HashMap<String, List<Marks>>();
		
		List<Marks> list = new ArrayList<Marks>();
		
		list.add(new Marks(90));
		list.add(new Marks(85));
		list.add(new Marks(75));
		list.add(new Marks(80));
		list.add(new Marks(60));
		
		map.put("Prajkta", list);
		System.out.println(map);
	}

}


class Marks {
	int score;
	
	Marks(int score) {
		this.score = score;
	}
	
	public String toString() {
		return "Marks:" + score;
	}
}