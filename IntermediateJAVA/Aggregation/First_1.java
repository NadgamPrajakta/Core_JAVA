package aggregation;

public class First_1 {

	public static void main(String[] args) {

		Professor p = new Professor("Dr. Sharma");
		
		Department d = new Department(p);
		
		d.startLecture();
		
		Department d2 = new Department(null);
		
		d2.startLecture();

	}

}


class Professor {
	private String name;
	
	public Professor(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void teach() {
		System.out.println(name + " is teaching");
	}
}


class Department {
	private Professor professor;          // Aggregation
	
	public Department(Professor professor) {
		
		this.professor = professor;
	}
	
	public void startLecture() {
		
		try {
			if(professor == null)
				
				throw new NullPointerException("No professor assigned..!");
			professor.teach();
		}
		
		catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
