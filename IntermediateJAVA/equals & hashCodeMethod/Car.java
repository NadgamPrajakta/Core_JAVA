package equalsMethod;

import java.util.Objects;

public class Car {
	
	String model;
	String color;
	int year;
	
	Car(String model, String color, int year) {
		
		this.model = model;
		this.color = color;
		this.year = year;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(!(obj instanceof Car)) return false;
		
		Car c = (Car) obj;
		
		return year == c.year && model.equals(c.model) && color.equals(c.color);
	}
	
	public int hashCode() {
		return Objects.hash(model, color, year);
	}

	public static void main(String[] args) {
		
		Car c1 = new Car("Honda", "Black", 2025);
		Car c2 = new Car("Honda", "Black", 2025);
		
		System.out.println(c1.equals(c2));
	}

}
