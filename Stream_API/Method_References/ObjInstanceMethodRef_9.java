package method_references;
import java.util.function.Consumer;

public class ObjInstanceMethodRef_9 {
	
    public static void main(String[] args) {
    	
        Laptop l = new Laptop();
        
        Consumer<Laptop> c = lap -> l.showBrand();
        c.accept(l);
    }
}


class Laptop {
	
    void showBrand() {
    	
        System.out.println("HP Laptop");
    }
}
