package aggregation;

public class Fourth_4 {

	public static void main(String[] args) {
		
		Student s = new Student("Prajkta");
		
		College college = new College(s);
		
		college.conductClass();

	}

}


class Student {
	private String name;
	
	public Student(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}
}


class College {
	private Student student;
	
	public College(Student student) {
		
		this.student = student;
	}
	
	public void conductClass() {
		
		try {
			if(student == null) 
				
				throw new Exception("No student enrolled..!");
			
			System.out.println("Class started for: " + student.getName());
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
