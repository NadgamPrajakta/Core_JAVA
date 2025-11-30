package collection_class;

public class LoginValidator {

	public static void main(String[] args) {
		
		Validator isEmail = s -> s.contains("@") && s.contains(".");
        Validator minLength = s -> s.length() >= 6;
        Validator startsLetter = s -> Character.isLetter(s.charAt(0));
        Validator noSpaces = s -> !s.contains(" ");
        Validator hasNumber = s -> s.matches(".*\\d.*");
        Validator hasUpper = s -> s.matches(".*[A-Z].*");

        System.out.println(isEmail.validate("abc@gmail.com"));
        System.out.println(minLength.validate("secret"));
        System.out.println(startsLetter.validate("Java123"));
        System.out.println(noSpaces.validate("HelloWorld"));
        System.out.println(hasNumber.validate("abc123"));
        System.out.println(hasUpper.validate("javaA"));
    }
}

interface Validator {
	
	boolean validate(String input);
}
