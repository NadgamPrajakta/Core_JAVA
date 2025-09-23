package USS.com;
import java.util.Scanner;
public class Program {
      private String name;
      private int rollno;
      
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		System.out.println("Enter your rollno:");
		String name=sc.nextLine();
		int rollno = sc.nextInt();
		
		System.out.println("Hello,"+ name + "! Welcome to the java programming");
	}

}
