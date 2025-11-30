package collection_class;

public class Nine {

	public static void main(String[] args) {
		
		MessageFormat greet = n -> "Welcome To USS " + n;
		
		MessageFormat bye = n -> "goodbye " + n;
		
		MessageFormat thanks = n -> "Thank you " + n;
		
		MessageFormat welcome = n -> "Welcome " + n;
		
		MessageFormat upper = n -> n.toUpperCase();
	
		MessageFormat decorated = n -> "*** " + n + " ***";
		
		System.out.println(greet.format("Prajkta"));
		System.out.println(bye.format("John"));
		System.out.println(thanks.format("Students"));
		System.out.println(welcome.format("Friend"));
		System.out.println(upper.format("lambda"));
		System.out.println(decorated.format("Java"));
	}
	

}



interface MessageFormat {
	
	String format(String name);
}