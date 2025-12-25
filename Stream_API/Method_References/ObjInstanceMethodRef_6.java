package method_references;
import java.util.function.Consumer;

public class ObjInstanceMethodRef_6 {
	
    public static void main(String[] args) {
    	
    	Book_20 b = new Book_20();
        
        Consumer<Book_20> c = book -> b.showTitle();
        c.accept(b);
    }
}


class Book_20 {
	
    void showTitle() {
    	
        System.out.println("Java Programming");
    }
}