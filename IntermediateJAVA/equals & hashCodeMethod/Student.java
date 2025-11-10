package equalsMethod;

public class Student {
	
	private int rollNo; 
	private String course;
	private String name;
	private String emailid;
	
	Student(int rollNo, String course, String name, String emailid) {
		
		this.course = course;
		this.name = name;
		this.rollNo = rollNo;
		this.emailid = emailid;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(!(obj instanceof Student)) return false;
		
		Student s = (Student) obj;
		
		return rollNo == s.rollNo && course.equals(s.course);
	}
	
	public int hashCode() {
		return rollNo * 31 + course.hashCode();
	}

	public static void main(String[] args) {
		
		Student s1 = new Student(101, "AI", "Prajkta", "smartpn.ai20@gamil.com");
		Student s2 = new Student(101, "AI", "Prajkta", "smartpn.ai20@gamil.com");
		
		System.out.println(s1.equals(s2));
		
	}

}
