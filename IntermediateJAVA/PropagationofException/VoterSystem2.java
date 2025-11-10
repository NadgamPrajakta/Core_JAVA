package propagationofexception;



public class VoterSystem2 {

	public static void main(String[] args){

		try {
		  Voting.checkEligibility(19, false);
		}
		catch(Exception ex)
		  
		{
			ex.printStackTrace();
		}
	}

}

class Voting
{
	static public void checkEligibility(int age, boolean isIndian) throws FirstInvalidAgeEx, NotIndianException
	{	
		if(age<18)
		{
			throw new FirstInvalidAgeEx();
		}
		
		
		if(age>18)
		{
			throw new NotIndianException("Non-Bharatiya");
		}
		System.out.println("hii");
		
		
	}
}