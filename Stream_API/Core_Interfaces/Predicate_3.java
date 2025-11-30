package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_3 {

	public static void main(String[] args) {
		
		NonEmptyString obj = new NonEmptyString();
		
		System.out.println("Welcome To USS");
		
		Predicate<String> p = x -> ! x.isEmpty();
		
		System.out.println(p.test(" "));
	}

}


class NonEmptyString implements Predicate<String>  {

	public boolean test(String s) {
		
		return s != null && ! s.isEmpty();
	}
	
	
}
