package ExceptionHandling;


import java.util.Arrays;
import java.util.List;

public class Ex_Fourth {

	
//	static String str=null;
//	static char c=str.charAt(0);
	
	public static void main(String[] args) {
		
		System.out.println("NKOCET");

		
		List<Employee> list=Arrays.asList(new Employee("AA",233.67)
				, new Employee("BB",300.90),
				new Employee("AA",4533.78),
				new Employee("BB",454.67)
				);
	}

}


class Employee
{
	String name;
	double salary;
	
	public Employee(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}
}