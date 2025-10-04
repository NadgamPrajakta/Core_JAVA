package OOP_1;

public class Program_1 {

	public static void main(String[] args) {
		
		
		
		Prajkta.showclass();
		Actor.showclass();
	}
}


class Actor
{
	
	public   static void showclass()
	
	{
		System.out.println("This is the actor class..");
	}
	
}

class Prajkta extends Actor
{
	public  static void showclass()
	{
		System.out.println("are helloooo!");
	}
	
	
}