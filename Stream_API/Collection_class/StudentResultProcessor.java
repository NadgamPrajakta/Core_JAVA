package collection_class;

public class StudentResultProcessor {

	public static void main(String[] args) {
		
		Result passFail = m -> m >= 40 ? "Pass" : "Fail";
        Result grade = m -> m >= 90 ? "A+" :
                              m >= 80 ? "A" :
                              m >= 70 ? "B" :
                              m >= 60 ? "C" : "D";

        Result remarks = m -> m >= 75 ? "Excellent" : "Needs Improvement";
        Result bonus = m -> "After bonus: " + (m + 5);
        Result half = m -> "Half: " + (m / 2);
        Result doubleScore = m -> "Double: " + (m * 2);

        System.out.println(passFail.get(85));
        System.out.println(grade.get(85));
        System.out.println(remarks.get(85));
        System.out.println(bonus.get(85));
        System.out.println(half.get(85));
        System.out.println(doubleScore.get(85));
    }
}

interface Result {
	
	String get(int marks);
}
