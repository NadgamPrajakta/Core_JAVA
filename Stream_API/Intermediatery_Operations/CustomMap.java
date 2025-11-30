package intermediatary_ops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class CustomMap {

	public static void main(String[] args) {
	
		
		  Student_First Prajkta=new Student_First(12,"Prajkta");
		  Student_First John=new Student_First(13,"John");
		  Student_First Alice=new Student_First(14,"Alice");

		  
		  
		  Set<Student_First> set=new HashSet<Student_First>();
		  
		  set.add(Prajkta);
		  set.add(John);
		  set.add(Alice);
		  
		  Map<String, String> pincodes=new HashMap<String, String>();
		  
		  pincodes.put("Prajkta", "345664");
		  pincodes.put("John", "111111");
		  pincodes.put("Alice", "909090");
		  
		  System.out.println(set);
		  
		  set.stream().map((i)->{return new Student_Latest(i.id,i.name,pincodes.get(i.name));}).forEach((i)->{System.out.println(i);});
	}

}

class  Student_First
{
	int id;
	String name;
	
	public Student_First(int id,String name)
	{
		 this.id=id;
		 this.name=name;
	}
	
	public String toString()
	{
		return this.name+" "+this.id;
	}
}

class  Student_Latest
{
	int id;
	String name;
	String pincode;
	
	public Student_Latest (int id, String name,String pincode)
	{
		this.id=id;
		this.name=name;
		this.pincode=pincode;
	}
	
	public String toString()
	{
		return this.name+this.id+" "+this.pincode;
	}
}

class Converter implements Function<Student_First, Student_Latest>
{

	
	public Student_Latest apply(Student_First t) {
		
		 Student_Latest stud=new Student_Latest(t.id,t.name,"3454322");
		 return stud;
	}
	
}