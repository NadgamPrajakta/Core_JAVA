package equalsMethod;

import java.util.Objects;

public class Laptop {
	
	String brand;
	int ram;
	String processor;
	
	Laptop(String brand, int ram, String processor) {
		
		this.brand = brand;
		this.ram = ram;
		this.processor = processor;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(!(obj instanceof Laptop)) return false;
		
		Laptop l = (Laptop) obj;
		
		return ram == l.ram && brand.equals(l.brand) && processor.equals(l.processor);
	}
	
	public int hashCode() {
		return Objects.hash(brand, ram, processor);
	}

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("Dell", 16, "i7");
		Laptop l2 = new Laptop("Dell", 16, "i7");
		
		System.out.println(l1.equals(l2));
	}

}
