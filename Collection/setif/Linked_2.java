package setif;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Linked_2 {

	public static void main(String[] args) {
		
		Set<Person_1> people = new LinkedHashSet<>();
		
		people.add(new Person_1("Prajkta", 22));
		people.add(new Person_1("Alice", 20));
		people.add(new Person_1("Bob", 25));
		people.add(new Person_1("Charlie", 35));
		
		System.out.println("LinkedHashSet of Person objects: " + people);
		
	}

}


class Person_1 {
	
	private String name;
	private int age;
	
	public Person_1(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person_1 person = (Person_1) obj;
		return age == person.age && Objects.equals(name, person.name);
	}

	@Override
	public String toString() {
		return "Person_1 [name=" + name + ", age=" + age + "]";
	}	
	
}
