package CustomCheckedEx;

public class ThirdCustom_Ex {

	public static void main(String[] args) {
		
		try {
			String file = null;
			if(file == null) {
				
				throw new FileMissingException("File not found..!");
			}
			
//			System.out.println("File opend successfully..");
			
		}
			catch(FileMissingException ex) {
				
				System.out.println(ex.getMessage());
			}
			
			finally {
				System.out.println("File check complete..");
			}
		}
	}


class FileMissingException extends Exception{
	
	public FileMissingException(String str) {
		
		super(str);
	}
}
