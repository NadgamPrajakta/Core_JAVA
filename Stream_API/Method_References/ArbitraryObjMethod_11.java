package method_references;
import java.util.function.Consumer;

public class ArbitraryObjMethod_11 {
	
    public static void main(String[] args) {
    	
        Consumer<University> c = University::showUniversity;
        
        c.accept(new University());
    }
}


class University 
{
    void showUniversity()
    {
        System.out.println("Tech University");
    }
}
