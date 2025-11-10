package equalsMethod;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Vehicle {
	
	String registrationNo;
	String owner;
	
	Vehicle(String registrationNo, String owner) {
		
		this.registrationNo = registrationNo;
		this.owner = owner;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(!(obj instanceof Vehicle)) return false;
		
		Vehicle v = (Vehicle) obj;
		
		return registrationNo.equals(v.registrationNo);
	}
	
	public int hashCode() {
		return Objects.hash(registrationNo);
	}

	public static void main(String[] args) {
		
		Set<Vehicle> vehicles = new HashSet<>();
		
		vehicles.add(new Vehicle("MH12AB1234", "Prajkta"));
		vehicles.add(new Vehicle("MH12AB1234", "Prajkta"));
		
		System.out.println("Set size:" + vehicles.size());
		
	}

}
