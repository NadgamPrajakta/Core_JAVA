package misc2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMap_1 {

	public static void main(String[] args) {
		
		Department d1 = new Department(Arrays.asList("John Doe", "Alean Soni"));
		
		Department d2 = new Department(Arrays.asList("Bob", "Charlie"));
		
		List<Department> dept = Arrays.asList(d1, d2);
		
		List<String> allEmp = dept.stream().
				flatMap(d -> d.getEmployees().stream())
				.collect(Collectors.toList());
		
		System.out.println(allEmp);
	}

}

class Department {
	
	List<String> employees;
	
	Department(List<String> employees) {
		this.employees = employees;
	}
	
	List<String> getEmployees() {
		return employees;
	}
}
