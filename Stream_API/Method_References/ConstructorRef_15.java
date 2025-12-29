package method_references;

import java.util.function.BiFunction;

public class ConstructorRef_15 {
	
    public static void main(String[] args) {
    	
        BiFunction<String, Integer, City_9> bf = City_9::new;
        
        City_9 c = bf.apply("Mumbai", 20000000);
        System.out.println(c.name + " " + c.population);
    }
}


class City_9 
{
    String name;
    int population;
    
    City_9(String name, int population) 
    {
        this.name = name;
        this.population = population;
    }
}
