package equalsMethod;

import java.util.Objects;

public class Mobile {
	
	String brand;
	String model;
	double price;
	
	Mobile(String brand, String model, double price) {
		
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(!(obj instanceof Mobile)) return false;
		
		Mobile m = (Mobile) obj;
		
		return brand.equals(m.brand) && model.equals(m.model);
	}
	
	public int hashCode() {
		return Objects.hash(brand, model);
	}

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("Apple", "iPhone 14", 120000);
		Mobile m2 = new Mobile("Apple", "iPhone 14", 130000);
		
		System.out.println(m1.equals(m2));
	}

}
