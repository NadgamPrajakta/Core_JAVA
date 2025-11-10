package propagationofexception;


public class FirstInvalidAgeEx extends RuntimeException {

	
	public FirstInvalidAgeEx()
	{
		super("Invalid age exception");
	}
	public FirstInvalidAgeEx(String str)
	{
		super(str);
	}
}

 class NotIndianException extends RuntimeException
 {
	 
	 public NotIndianException(String str)
	 {
		 super(str);
		 
	 }
 }