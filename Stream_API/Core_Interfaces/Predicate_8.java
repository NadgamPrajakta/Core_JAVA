package coreInterfaces;

import java.util.function.Predicate;

public class Predicate_8 {

	public static void main(String[] args) {
		
		Vowel_Character obj = new Vowel_Character('a');
        System.out.println("Override test(): " + obj.test(obj.ch));

        Predicate<Character> isVowel = x -> "AEIOUaeiou".contains(x + "");
        Predicate<Character> isLower = x -> Character.isLowerCase(x);

        System.out.println("OR: " + isVowel.or(isLower).test('B'));
        System.out.println("AND: " + isVowel.and(isLower).test('a'));
        System.out.println("NEGATE: " + isVowel.negate().test('e'));
	}

}


class Vowel_Character implements Predicate<Character> {

     char ch;

    public Vowel_Character(char ch) {
        this.ch = ch;
    }

    @Override
    public boolean test(Character c) {
        return "AEIOUaeiou".contains(c + "");
    }
}
