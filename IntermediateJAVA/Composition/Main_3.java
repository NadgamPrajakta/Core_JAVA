package Composition;

public class Main_3 {

	public static void main(String[] args) {

		Computer comp = new Computer("Intel");
		comp.run();
	}

}

class CPU {
	private String brand;
	
	public CPU(String brand) {
		
		this.brand = brand;
	}
	
	public void process() throws Exception {
		
		if(brand == null || brand.isEmpty())
			
			throw new Exception("CPU brand Missing..!");
		
		System.out.println("CPU by " + brand + " is processing...");
	}
}


class Computer {
	private CPU cpu;
	
	public Computer(String brand) {
		cpu = new CPU(brand);           // created internally
	}
	
	public void run() {
		
		try {
			cpu.process();
			System.out.println("Computer running successfully...");
		}
		
		catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}