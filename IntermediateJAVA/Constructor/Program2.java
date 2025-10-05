package Ctor;


class Bank{
	private int account_no;
	private String name;  // IV
	private static int IFSC_code;  // CLV

	public Bank() {
		System.out.println("Inside Bank class ctor");
	}
	static {
		System.out.println("Inside Bank class Static BLock");
	}	
	
}
class A{
	static {
		System.out.println("Inside A class Static BLock");
	}
}
public class Program2{
	
	public static int sr_no;
	static {
		System.out.println("Inside Program class Static block");
	}

	public static void main(String[] args) {
		System.out.println("Inside main method()");
		Bank b1 = new Bank();
		A a = new A();
	}

}