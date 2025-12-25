package method_references;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class Fifth {

	public static void main(String[] args) {
		
		ICONN<A,String> con=A::new;
		
		
	// System.out.println(con.accept("Tamannah James").hashCode());
	 
	 Function<Integer, ArrayList> fun=ArrayList::new;
	 
	 System.out.println(fun.apply(30).getClass());
	 
	 Function<String, String> fun3=String::new;
	 System.out.println(fun3.apply("hello").toUpperCase());
			 
	}

}

interface ICONN <A,T>
{
	A accept(T t);
}
class A
{
	public A(String s)
	{
		System.out.println("byeee");
		System.out.println("object created : value recieved:"+s);
	}
}