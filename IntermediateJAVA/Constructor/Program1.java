package Ctor;

class Date{
	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}
	public Date(int day,int month, int  year) {
		System.out.println("Inside date class ctor");
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void printRecord() {
		System.out.println(this.day+" / "+this.month+" / "+this.year);
	}
}
class Employee{
	private int empid;
	private Date joindate;
	
	public Employee(int empid,int day,int month,int year) {
		System.out.println("Inside employee class ctor");
		this.empid = empid;
		this.joindate = new Date(day,month,year);
	}
}

public class Program1 {

	public static void main(String[] args) {
		Employee emp = new Employee(12345,14,01,2019);
	}
	public static void main1(String[] args) {
		Date dt = new Date(14,01,2019);
		dt.printRecord();
		// dt  => reference => stack
		// new Date() => object => heap
	}

}