package equalsMethod;

import java.util.Objects;

public class Product {
	
	int id;
	String name;
	double price;
	
	Product(int id, String name, double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		
		if(!(obj instanceof Product)) return false;
		
		Product p = (Product) obj;
		
		return id == p.id && Double.compare(p.price,  price) == 0 && name.equals(p.name);
	}
	
	public int hashCode() {
		return Objects.hash(id, name, price);
	}

	public static void main(String[] args) {
		
		Product p1 = new Product(101, "Laptop", 75000);
		Product p2 = new Product(101, "Laptop", 75000);
		
		System.out.println(p1.equals(p2));
	}

}
