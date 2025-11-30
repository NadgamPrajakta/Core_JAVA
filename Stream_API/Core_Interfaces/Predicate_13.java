package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_13 {

	public static void main(String[] args) {
		
		Check_Password obj = new Check_Password("pass1234");
        System.out.println("Override test(): " + obj.test(obj.password));

        Predicate<String> hasDigit = x -> x.matches(".*\\d.*");
        Predicate<String> hasUpper = x -> x.matches(".*[A-Z].*");

        System.out.println("OR: " + hasDigit.or(hasUpper).test("hello"));
        System.out.println("AND: " + hasDigit.and(hasUpper).test("Hello1"));
        System.out.println("NEGATE: " + hasDigit.negate().test("Test"));

	}

}


class Check_Password implements Predicate<String> {

     String password;

    public Check_Password(String password) {
        this.password = password;
    }

    @Override
    public boolean test(String pass) {
        return pass.length() >= 8 && pass.matches(".*\\d.*");
    }
}
