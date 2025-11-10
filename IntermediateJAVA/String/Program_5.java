package String_;

public class Program_5 {

	public static void main(String[] args) {


		byte ascii[] = { 51, 70, 61};
		
		char characters[] = {'N', 'K', 'O', 'C', 'E', 'T'};
		
		String fourthString = new String(characters);
		
		String fifthString = new String(fourthString);
		
		String firstString = new String(ascii);
		
		System.out.println(firstString);
		
		String secondString = new String(ascii, 1, 2);
		
		System.out.println(secondString);
		
		System.out.println(fourthString);
		
		System.out.println(fifthString);
		}

}
