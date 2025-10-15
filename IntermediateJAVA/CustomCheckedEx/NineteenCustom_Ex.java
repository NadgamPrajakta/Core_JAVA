package CustomCheckedEx;

public class NineteenCustom_Ex {

	public static void main(String[] args) {
		
		try {
			String config = null;
			if(config == null) {
				
				throw new ConfigurationLoadException();
			}
			
			System.out.println("Configuration loaded..");
		}
		
		catch(ConfigurationLoadException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("Configuration check finished..!");
		}
	}

}

class ConfigurationLoadException extends Exception {
	
	public ConfigurationLoadException() {
		
		super("Configuration file missing..!");
	}
}
