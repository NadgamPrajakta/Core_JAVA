package method_references;

import java.util.function.Function;

public class ConstructorRef_5 {
	
    public static void main(String[] args) {
    	
        Function<String, Book_19> f = Book_19::new;
        System.out.println(f.apply("Java 8").title);
    }
}


class Book_19 {
	
    String title;
    
    Book_19(String title) 
    {
        this.title = title;
    }
}