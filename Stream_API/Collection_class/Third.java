package collection_class;

public class Third {

	public static void main(String[] args) {
		
		MathOperation add = (a, b) -> a + b;
		
		MathOperation subtract = (a, b) -> a - b;
		
		MathOperation multiply = (a, b) -> a * b;
		
		MathOperation divide = (a, b) -> b != 0 ? a / b : 0;
		
		MathOperation max = (a, b) -> (a > b) ? a : b;
		
		MathOperation min = (a, b) -> (a < b) ? a : b;
		
		System.out.println("Addition:" + add.operate(40, 50));
		System.out.println("Subtraction:" + add.operate(30, 20));
		System.out.println("Multiplication:" + add.operate(10, 8));
		System.out.println("Division:" + add.operate(20, 4));
		System.out.println("Maximum:" + add.operate(15, 8));
		System.out.println("Minimum:" + add.operate(30, 9));
	}

}

interface MathOperation {
	
	int operate(int a, int b);
}


