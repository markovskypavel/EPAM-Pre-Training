package by.markovsky.tasktwo.exercisetwo.model;

import by.markovsky.tasktwo.exception.LetterException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Pavel Markovsky on 05.02.2018.
 */
public class LetterChecker {

    public static final String VOWELS = "aeiuoyAEIUOY";

    //Check if the letter is vowel or consonant (5 variants)
    //The first variant
    public static boolean isVowel1(char enteredLetter) throws LetterException {
        if (!(enteredLetter >= 'A' && enteredLetter <= 'Z') && !(enteredLetter >= 'a' && enteredLetter <= 'z')) {
            throw new LetterException("Letter of english alphabet wasn't entered.");
        }
        char letter = Character.toLowerCase(enteredLetter);
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y';
    }

    //The second variant
    public static boolean isVowel2(char enteredLetter) throws LetterException {
        if (!(enteredLetter >= 'A' && enteredLetter <= 'Z') && !(enteredLetter >= 'a' && enteredLetter <= 'z')) {
            throw new LetterException("Letter of english alphabet wasn't entered.");
        }
        Pattern p = Pattern.compile("[aeiouyAEIOUY]");
        Matcher m = p.matcher(String.valueOf(enteredLetter));
        return m.matches();
    }

    //The third variant
    public static boolean isVowel3(char enteredLetter) throws LetterException {
        if (!(enteredLetter >= 'A' && enteredLetter <= 'Z') && !(enteredLetter >= 'a' && enteredLetter <= 'z')) {
            throw new LetterException("Letter of english alphabet wasn't entered.");
        }
        return VOWELS.contains(Character.toString(enteredLetter));
    }

    //The fourth variant
    public static boolean isVowel4(char enteredLetter) throws LetterException {
        if (!(enteredLetter >= 'A' && enteredLetter <= 'Z') && !(enteredLetter >= 'a' && enteredLetter <= 'z')) {
            throw new LetterException("Letter of english alphabet wasn't entered.");
        }
        switch (Character.toLowerCase(enteredLetter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
        }
        return false;
    }

    //ADDITIONAL VARIANTS (NOT PROFITABLE)
    //The fifth variant (alternative of isVowel1)
    public static boolean isVowel5(char enteredLetter) throws LetterException {
        if (!(enteredLetter >= 'A' && enteredLetter <= 'Z') && !(enteredLetter >= 'a' && enteredLetter <= 'z')) {
            throw new LetterException("Letter of english alphabet wasn't entered.");
        }
        boolean vowel;
        char letter = Character.toLowerCase(enteredLetter);
        if (letter == 'a') {
            vowel = true;
        } else if (letter == 'e') {
            vowel = true;
        } else if (letter == 'i') {
            vowel = true;
        } else if (letter == 'o') {
            vowel = true;
        } else if (letter == 'u') {
            vowel = true;
        } else if (letter == 'y') {
            vowel = true;
        } else {
            vowel = false;
        }
        return vowel;
    }

}
