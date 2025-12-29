package method_references;

import java.util.function.Function;

public class ConstructorRef_6 {
	
    public static void main(String[] args) {
    	
        Function<String, Vehicle> f = Vehicle::new;
        System.out.println(f.apply("Tesla").model);
    }
}


class Vehicle {
	
    String model;
    
    Vehicle(String model) 
    {
        this.model = model;
    }
}