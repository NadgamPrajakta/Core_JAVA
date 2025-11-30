package collection_class;

public class Fourth {

	public static void main(String[] args) {
		
		StringProcess upper = s -> s.toUpperCase();
		
		StringProcess lower = s -> s.toLowerCase();
		
		StringProcess reverse = s -> new StringBuilder(s).reverse().toString();
		
		StringProcess trim = s -> s.trim();
		
		StringProcess addHello = s -> "Hello " + s;
		
		StringProcess first3 = s -> s.length() >= 3 ? s.substring(0, 3) : s;
		
		System.out.println(upper.apply("java"));
		
		System.out.println(lower.apply("PYTHON"));
		
		System.out.println(reverse.apply("Lambda"));
		
		System.out.println(trim.apply("Hello "));
		
		System.out.println(addHello.apply("Prajkta"));
		
		System.out.println(first3.apply("Functional"));
	}

}


interface StringProcess {
	
	String apply(String s);
}
