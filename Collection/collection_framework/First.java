package collection_framework;

import collection_framework.IStudent;

public class First {

	public static void main(String[] args) {
		
	}

}



/**
 * 
 * @param <T>
 */
interface IStudent 
{
	
	  double CalculateAverage();
	
}


class Student implements IStudent
{
	String name;
	int[] marks;
	@Override
	public double CalculateAverage() {
		// TODO Auto-generated method stub
		return 0;
	}
}

