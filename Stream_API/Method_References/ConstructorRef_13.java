package method_references;

import java.util.function.BiFunction;

public class ConstructorRef_13 {
	
    public static void main(String[] args) {
    	
        BiFunction<String, String, Flight_4> bf = Flight_4::new;
        
        Flight_4 f = bf.apply("Pune", "Delhi");
        System.out.println(f.source + " → " + f.destination);
    }
}


class Flight_4
{
    String source;
    String destination;
    
    Flight_4(String source, String destination)
    {
        this.source = source;
        this.destination = destination;
    }
}