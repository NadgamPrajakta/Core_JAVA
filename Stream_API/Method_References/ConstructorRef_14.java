package method_references;

import java.util.function.BiFunction;

public class ConstructorRef_14 {
	
    public static void main(String[] args) {
    	
        BiFunction<String, Integer, Hotel_7> bf = Hotel_7::new;
        
        Hotel_7 h = bf.apply("Taj", 5);
        System.out.println(h.name + " " + h.rating);
    }
}


class Hotel_7
{
    String name;
    int rating;
    
    Hotel_7(String name, int rating)
    {
        this.name = name;
        this.rating = rating;
    }
}