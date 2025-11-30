package collection_class;

public class Seven {

	public static void main(String[] args) {
		
		
		    CompareString equal = (a, b) -> a.equals(b);
	        CompareString ignoreCase = (a, b) -> a.equalsIgnoreCase(b);
	        CompareString startsSame = (a, b) -> a.charAt(0) == b.charAt(0);
	        CompareString endsSame = (a, b) -> a.endsWith(b);
	        CompareString contains = (a, b) -> a.contains(b);
	        CompareString longer = (a, b) -> a.length() > b.length();

	        System.out.println(equal.compare("Java", "Java"));
	        System.out.println(ignoreCase.compare("java", "JAVA"));
	        System.out.println(startsSame.compare("Apple", "Ant"));
	        System.out.println(endsSame.compare("running", "ing"));
	        System.out.println(contains.compare("functional", "fun"));
	        System.out.println(longer.compare("Hello", "Hi"));
	    }
	}


interface CompareString {
	
	boolean compare(String a, String b);
}
