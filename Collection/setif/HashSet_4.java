package setif;
import java.util.*;

public class HashSet_4 {
	
    public static void main(String[] args){
    	
        HashSet<City> set=new HashSet<City>();
        
        set.add(new City("Pune"));
        System.out.println(set.contains(new City("Pune")));
    }
}


class City {
	
    String name;
    
    City(String n){
    	name=n;
    	}

    public boolean equals(Object o){
    	
    	return name.equals(((City)o).name);
    
    }
    
    public int hashCode(){
    	
    	return name.hashCode();}
}
