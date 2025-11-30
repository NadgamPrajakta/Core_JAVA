package collection_class;

public class Ten {

	public static void main(String[] args) {
		
		ConvertTemp cToF = c -> (c * 9 / 5) + 32;
        ConvertTemp fToC = f -> (f - 32) * 5 / 9;
        ConvertTemp cToK = c -> c + 273.15;
        ConvertTemp kToC = k -> k - 273.15;
        ConvertTemp fToK = f -> ((f - 32) * 5 / 9) + 273.15;
        ConvertTemp kToF = k -> ((k - 273.15) * 9 / 5) + 32;

        System.out.println(cToF.convert(25));
        System.out.println(fToC.convert(77));
        System.out.println(cToK.convert(0));
        System.out.println(kToC.convert(300));
        System.out.println(fToK.convert(98));
        System.out.println(kToF.convert(300));
    }
}


interface ConvertTemp {
	
	double convert(double temp);
}
