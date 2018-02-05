package by.markovsky.tasktwo.exercisetwo.model;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Pavel Markovsky on 05.02.2018.
 */
public class LetterChecker {

    public static final String VOWELS = "aeiuoyAEIUOY";

    //Check if the letter is vowel or consonant (6 variants)
    //The first variant
    public static boolean isVowel1(char enteredLetter) throws IOException {
        if (!(enteredLetter >= 'A' && enteredLetter <= 'Z') && !(enteredLetter >= 'a' && enteredLetter <= 'z')) {
            throw new IOException();
        }
        char letter = Character.toLowerCase(enteredLetter);
        return (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y');
    }

    //The second variant
    public static boolean isVowel2(char enteredLetter) throws IOException {
        if (!(enteredLetter >= 'A' && enteredLetter <= 'Z') && !(enteredLetter >= 'a' && enteredLetter <= 'z')) {
            throw new IOException();
        }
        Pattern p = Pattern.compile("[aeiouyAEIOUY]");
        Matcher m = p.matcher(String.valueOf(enteredLetter));
        return m.matches();
    }

    //The third variant
    public static boolean isVowel3(char enteredLetter) throws IOException {
        if (!(enteredLetter >= 'A' && enteredLetter <= 'Z') && !(enteredLetter >= 'a' && enteredLetter <= 'z')) {
            throw new IOException();
        }
        return VOWELS.contains(Character.toString(enteredLetter));
    }

    //The fourth variant
    public static boolean isVowel4(char enteredLetter) throws IOException {
        if (!(enteredLetter >= 'A' && enteredLetter <= 'Z') && !(enteredLetter >= 'a' && enteredLetter <= 'z')) {
            throw new IOException();
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
    public static boolean isVowel5(char enteredLetter) throws IOException {
        if (!(enteredLetter >= 'A' && enteredLetter <= 'Z') && !(enteredLetter >= 'a' && enteredLetter <= 'z')) {
            throw new IOException();
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

    //The sixth variant (alternative of isVowel1)
    public static boolean isVowel6(char enteredLetter) throws IOException {
        if (!(enteredLetter >= 'A' && enteredLetter <= 'Z') && !(enteredLetter >= 'a' && enteredLetter <= 'z')) {
            throw new IOException();
        }
        boolean vowel = false;
        char letter = Character.toLowerCase(enteredLetter);
        if (letter == 'a') {
            vowel = true;
        }
        if (letter == 'e') {
            vowel = true;
        }
        if (letter == 'i') {
            vowel = true;
        }
        if (letter == 'o') {
            vowel = true;
        }
        if (letter == 'u') {
            vowel = true;
        }
        if (letter == 'y') {
            vowel = true;
        }
        return vowel;
    }

}
