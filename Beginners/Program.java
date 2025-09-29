package uss.com;

import java.util.Scanner;

class Employee{
	private int empid;
	private String name;
	private float salary;
	public void displayRecord() { //(Employee this)
		System.out.println("Empid = "+empid);
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
	}
	public Employee(int empid, String name, float salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getEmpid() {
		return this.empid;
	}
	public String getName() {
		return this.name;
	}
	public float getSalary() {
		return this.salary;
	}
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name = ");
		this.name = sc.nextLine();
		System.out.println("Enter Empid = ");
		this.empid = sc.nextInt();
		System.out.println("Enter Salary = ");
		this.salary = sc.nextFloat();
	}
}
public class Program {

	public static void main(String[] args) {
		//Employee emp1 = new Employee();
		Employee emp2 = new Employee(412,"Prajkta",250000);
		int empid = emp2.getEmpid();
		System.out.println("Empid = "+empid);
		String name = emp2.getName();
		System.out.println("Name = "+name);
		float salary = emp2.getSalary();
		System.out.println("Salary = "+salary);
	}
	public static void main1(String[] args) {
		
//		//Employee emp1 = new Employee();
//		emp1.displayRecord(); // emp1.displyaRecord(emp1)
//		emp1.acceptRecord();
//		emp1.displayRecord();
////		//emp1.salary = 987665;   not allow
//		emp1.setSalary(86756.00f);
//		emp1.setName("Amit");
//		emp1.setEmpid(9876);
//		emp1.displayRecord();

	}

}
