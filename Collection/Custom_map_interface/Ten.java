package custom_map_if;

import java.util.Hashtable;

public class Ten {

	public static void main(String[] args) {
		
		Hashtable<Key, Value> table = new Hashtable<>();
		
		table.put(new Key(1), new Value("Data1"));
		table.put(new Key(2), new Value("Data2"));
		table.put(new Key(3), new Value("Data3"));
		table.put(new Key(4), new Value("Data4"));
		table.put(new Key(5), new Value("Data5"));

		System.out.println(table);
	}

}


class Key {
	int id;
	
	Key(int id) {
		this.id = id;
	}
	
	public int hashCode() {
		return id;
	}
	
	public boolean equals(Object obj) {
		return this.id == ((Key)obj).id;
	}
	
	public String toString() {
		return "Key:" + id;
	}
}


class Value {
	String data;
	
	Value(String data) {
		this.data = data;
	}
	
	public String toString() {
		return data;
	}
	
}
