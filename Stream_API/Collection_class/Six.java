package collection_class;

public class Six {

	public static void main(String[] args) {
		
		DoubleOperation square = x -> x * x;
        DoubleOperation cube = x -> x * x * x;
        DoubleOperation half = x -> x / 2;
        DoubleOperation doubleValue = x -> x * 2;
        DoubleOperation negate = x -> -x;
        DoubleOperation sqrt = x -> Math.sqrt(x);

        System.out.println(square.calc(4));
        System.out.println(cube.calc(3));
        System.out.println(half.calc(10));
        System.out.println(doubleValue.calc(5));
        System.out.println(negate.calc(8));
        System.out.println(sqrt.calc(16));
    }
}


interface DoubleOperation {
	
	double calc(double x);
}
