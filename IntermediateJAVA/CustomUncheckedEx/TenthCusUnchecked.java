package CustomUncheckedEx;

public class TenthCusUnchecked {

	public static void main(String[] args) {
		
		try {
			boolean cacheLoaded = false;
			if(!cacheLoaded) {
				
				throw new CacheLoadRuntimeException();
			}
			
			System.out.println("Cache ready.");
		}
		
		catch(CacheLoadRuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Cache loading check complete..!");
		}
	}

}

class CacheLoadRuntimeException extends RuntimeException {
	
	public CacheLoadRuntimeException() {
		
		super("Cache failed to load..!");
	}
}
