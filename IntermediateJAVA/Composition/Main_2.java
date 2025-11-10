package Composition;

public class Main_2 {

	public static void main(String[] args) {
		
		Human h = new Human();
		h.live();

	}

}

class Heart {
	private int bpm;
	
	public Heart(int bpm) {
		this.bpm = bpm;
	}
	
	public int getBpm() {
		return bpm;
	}
	
	public void pump() throws Exception {
		
		if(bpm <= 0)
			throw new Exception("Invalid heart rate..!");
		
		System.out.println("Heart pumping at" + bpm + " BPM..");
	}
}

class Human {
	private Heart heart = new Heart(72);
	
	public void live() {
		try {
			heart.pump();
			
			System.out.println("Human is alive..!");
		}
		
		catch(Exception ex) {
			System.out.println("Error:" + ex.getMessage());
		}
	}
}
