package Composition;

public class Main_5 {

	public static void main(String[] args) {
		
		Laptop lp = new Laptop();
		lp.powerOn();

	}

}


class Battery {
	private int capacity;
	
	public Battery(int capacity) {
		
		this.capacity = capacity;
	}
	
	public void charge() throws Exception {
		
		if(capacity <= 0)
			
			throw new Exception("Battery not available..!");
		
		System.out.println("Charging battery with capacity: " + capacity + "mAh");
	}
}


class Laptop {
	private Battery battery = new Battery(5000);
	
	public void powerOn() {
		
		try {
			battery.charge();
			
			System.out.println("Laptop powered on..");
		}
		
		catch(Exception ex) {
			System.out.println("Battery issue: " + ex.getMessage());
		}
	}
}
