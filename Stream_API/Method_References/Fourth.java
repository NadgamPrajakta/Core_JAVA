package method_references;

import java.util.Arrays;
import java.util.List;

public class Fourth {

	public static void main(String[] args) {
		
List<String> list=Arrays.asList("Latur","Solapur","RamPur","Pune","Mumbai","Lucknow");
//80 => Reverse.
		

   
//peek() => Consumer =>Intermediatery => Inspector
list.stream().peek(System.out::println)
.filter(Ascii_checker::check)
    .map(StringBuffer::new)
    .map(StringBuffer::reverse)
    .map(StringBuffer::toString)
    .forEach(System.out::println);  		
		

	}

}

class Ascii_checker
{
	public  static boolean check(String s)
	{
		return s.charAt(0)>80;
	}
}