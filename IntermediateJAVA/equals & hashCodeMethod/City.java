package equalsMethod;

import java.util.Objects;

public class City {
	
	String name;
	String state;
	int population;
	
	City(String name, String state, int population) {
		
		this.name = name;
		this.state = state;
		this.population = population;
		
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(!(obj instanceof City)) return false;
		
		City c = (City) obj;
		
		return name.equals(c.name) && state.equals(c.state);
	}
	
	public int hashCode() {
		 return Objects.hash(name, state);
	}

	public static void main(String[] args) {
		
		City c1 = new City("Pune", "Maharashtra", 500000);
		City c2 = new City("Pune", "Maharashtra", 600000);
		
		System.out.println(c1.equals(c2));

	}

}
