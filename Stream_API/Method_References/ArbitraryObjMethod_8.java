package method_references;
import java.util.function.Consumer;

public class ArbitraryObjMethod_8 {
	
    public static void main(String[] args) {
    	
        Consumer<Hospital> c = Hospital::showHospital;
        
        c.accept(new Hospital());
    }
}


class Hospital {
	
    void showHospital()
    {
        System.out.println("City Hospital");
    }
}
