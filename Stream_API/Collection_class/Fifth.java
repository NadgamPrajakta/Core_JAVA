package collection_class;

public class Fifth {

	public static void main(String[] args) {

		CheckNumber isEven = n -> n % 2 == 0;
		
        CheckNumber isOdd = n -> n % 2 != 0;
        
        CheckNumber isPositive = n -> n > 0;
        
        CheckNumber isNegative = n -> n < 0;
        
        CheckNumber isMultiple10 = n -> n % 10 == 0;
        
        CheckNumber isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= n / 2; i++)
                if (n % i == 0) return false;
            return true;
        };

        System.out.println(isEven.check(20));
        System.out.println(isOdd.check(11));
        System.out.println(isPositive.check(5));
        System.out.println(isNegative.check(-2));
        System.out.println(isMultiple10.check(40));
        System.out.println(isPrime.check(13));
    }
}

interface CheckNumber {
	
	boolean check(int n);
}
