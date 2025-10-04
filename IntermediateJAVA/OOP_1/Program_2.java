package OOP_1;

public class Program_2 {

	public static void main(String[] args) {
		I_sport.info();
		//Cricket.info();
	}
}

interface  I_sport
{
	public static void info()
	{
		System.out.println("This is the info of sports i/f");
	}
}


class Cricket implements I_sport
{
	public   void info()
	{
		I_sport.info();
		System.out.println("info in Cricket");
	}
}