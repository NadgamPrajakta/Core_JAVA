package method_references;
import java.util.function.Function;

public class ArbitraryObjMethod_12 {
	
    public static void main(String[] args) {
    	
        Function<Insurance, Double> f = Insurance::getPremium;
        
        System.out.println(f.apply(new Insurance()));
    }
}


class Insurance {
	
    double premium = 2500;
    
    double getPremium()
    {
        return premium;
    }
}