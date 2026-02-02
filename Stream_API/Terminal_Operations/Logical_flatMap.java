package terminal_ops;

import java.util.Arrays;
import java.util.List;

public class Logical_flatMap {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("abc", "def");
		
		List<String> list2 = Arrays.asList("ghi", "jkl");
		
		List<String> list3 = Arrays.asList("mno", "pqr");
		
		List<String> list4 = Arrays.asList("stu", "vwx");
		
		List<List<String>> list5 = Arrays.asList(list1, list2);
		
		List<List<String>> list6 = Arrays.asList(list3, list4);
		
		List<List<List<String>>> list7 = Arrays.asList(list5, list6);
		
		int sum = list7.stream()
				.flatMap((i)-> {return i.stream();})
				.flatMap((j)-> {return j.stream();})
				.map((i)->{return i.length();})
				.reduce(0,(i,j) -> (i+j));
				
				System.out.println(list7);
				
				System.out.println(sum);
				

			}

		}