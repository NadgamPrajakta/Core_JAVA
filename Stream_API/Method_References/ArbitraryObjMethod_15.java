package method_references;
import java.util.function.Function;

public class ArbitraryObjMethod_15 {
	
    public static void main(String[] args) {
    	
        Function<TrainingCourse, Integer> f = TrainingCourse::getDuration;
        
        System.out.println(f.apply(new TrainingCourse()));
    }
}


class TrainingCourse 
{
    int duration = 6;
    
    int getDuration()
    {
        return duration;
    }
}