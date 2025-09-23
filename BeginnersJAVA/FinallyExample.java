package USS.Com;

public class FinallyExample {

	public static void main(String[] args) {
		try {
			int data = 50 / 0;      // Arithmetic Exception
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught:"+e);
		}
		finally {
			System.out.println("Finally block is always executed");
		}
	}

}
