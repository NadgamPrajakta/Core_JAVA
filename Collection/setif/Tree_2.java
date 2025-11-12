package setif;

import java.util.Set;
import java.util.TreeSet;

public class Tree_2 {

	public static void main(String[] args) {
		
		Set<Person> people = new TreeSet<>();
		
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));
		
		System.out.println("TreeSet of Person objects:" + people);
		
	}

}


class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;	
	}
	
	@Override
	public int compareTo(Person o) {
		
		return Integer.compare(this.age, o.age);
	}
	
	public String toString() {
		return "Person{name=" + name + ", age=" + age +"}";
	}
}