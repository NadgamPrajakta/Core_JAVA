package method_references;

import java.util.function.BiFunction;

public class ConstructorRef_11 {
	
    public static void main(String[] args) {
    	
        BiFunction<String, Integer, User_6> bf = User_6::new;
        
        User_6 u = bf.apply("admin", 25);
        System.out.println(u.username + " " + u.age);
    }
}


class User_6 
{
    String username;
    int age;
    
    User_6(String username, int age) 
    {
        this.username = username;
        this.age = age;
    }
}