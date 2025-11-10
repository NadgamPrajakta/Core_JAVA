package equalsMethod;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
     public boolean equals(Object obj) {
    	 if(this == obj) return true;
    	 
    	 if(obj == null || getClass() != obj.getClass()) 
		 return false;
    	 
    	 Person person = (Person) obj;
    	 
    	 return age == person.age && name.equals(person.name);
     }
     
     public int hashCode() {
    	 return name.hashCode() + age;
     }
	

	public static void main(String[] args) {
		
		Person p1 = new Person("Prajkta", 22);
		Person p2 = new Person("Pratibha", 21);
		
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode() == p2.hashCode());
	}

}
