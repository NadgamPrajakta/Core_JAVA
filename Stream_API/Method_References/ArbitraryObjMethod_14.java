package method_references;
import java.util.function.Consumer;

public class ArbitraryObjMethod_14 {
	
    public static void main(String[] args) {
    	
        Consumer<Hotel> c = Hotel::showHotel;
        
        c.accept(new Hotel());
    }
}


class Hotel {
	
    void showHotel() 
    {
        System.out.println("5-Star Hotel");
    }
}
