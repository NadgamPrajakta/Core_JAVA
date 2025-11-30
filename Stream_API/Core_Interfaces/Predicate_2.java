package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_2 {

	public static void main(String[] args) {
		
		EvenCheck obj = new EvenCheck();
		
		System.out.println(obj.test(10));	
		
		Predicate<Integer> pred=(i)->{return i % 2 == 0;};
		Predicate<Integer> pred1=(j)->{return j % 4 == 0;};

		}

}

class EvenCheck implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		
		return t % 2 == 0;
	}
	
	
}
