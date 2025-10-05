package Ctor;



class Test{
	private int num1;
	private int num2;
	private static int num3;  // class level variable
	static {    
		Test.num3 = 100;
	}
//	public Test(int a, int b) {
//		num1 = a;
//		num2 = b;
//	}
	public Test(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public Test(){
		num1 = 0;
		num2 = 0;
	}
	//instance method
	public void printRecord() {  // public void printRecord(Test this)
		System.out.println("Num1 = "+num1);
		System.out.println("Num2 = "+num2);
		
		System.out.println();
	}
	public static void displayRecord() {  // class level method
		System.out.println("Num3 = "+Test.num3);
//		System.out.println("Num1 = "+num1);
//		System.out.println("Num2 = "+num2);   not allowed
		
	}
}
public class Program3{

	public static void main(String[] args) {
		Test t1 = new Test(10,20);
		
		t1.printRecord();  //t1.printRecord(t1);
		//Test.displayRecord(); 
		
	}

	public static void main1(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		t1.printRecord();  //t1.printRecord(t1);
		t2.printRecord();  //t2.printRecord(t2);
	}

}
