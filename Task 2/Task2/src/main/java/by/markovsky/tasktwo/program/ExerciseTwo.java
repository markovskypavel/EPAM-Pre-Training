package by.markovsky.tasktwo.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Character.toLowerCase;

/**
 * Created by Pavel Markovsky on 30.01.2018.
 */
public class ExerciseTwo {

    public static final char A = 'a';
    public static final char I = 'i';
    public static final char U = 'u';
    public static final char E = 'e';
    public static final char O = 'o';

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your english letter: ");
            char letter = (char) reader.read();
            if (!(letter >= 'A' && letter <= 'Z') && !(letter >= 'a' && letter <= 'z')) {
                throw new Exception();
            }
            System.out.println("Your letter is " + letter
                    + " (" + (isVowel1(toLowerCase(letter)) ? "vowel" : "consonant") + ")");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            System.err.println("It is not an English letter!");
        }
    }

    //Check if the letter is vowel or consonant (10 variants)
    public static boolean isVowel1(char letter) { //The first variant
        boolean vowel = false;
        if (letter == A || letter == E || letter == I || letter == O || letter == U) {
            vowel = true;
        }
        return vowel;
    }

    public static boolean isVowel12(char letter) { //The second variant of isVowel1
        boolean vowel;
        if (letter == A || letter == E || letter == I || letter == O || letter == U) {
            vowel = true;
        } else {
            vowel = false;
        }
        return vowel;
    }

    public static boolean isVowel13(char letter) { //The third variant of isVowel1
        return (letter == A || letter == E || letter == I || letter == O || letter == U);
    }

    public static boolean isVowel14(char letter) { //The fourth variant of isVowel1
        return (letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 117);
    }

    public static boolean isVowel2(char letter) { //The second variant
        boolean vowel;
        if (letter == A) {
            vowel = true;
        } else if (letter == E) {
            vowel = true;
        } else if (letter == I) {
            vowel = true;
        } else if (letter == O) {
            vowel = true;
        } else if (letter == U) {
            vowel = true;
        } else {
            vowel = false;
        }
        return vowel;
    }

    public static boolean isVowel3(char letter) { //The third variant
        boolean vowel;
        switch (letter) {
            case A:
                vowel = true;
                break;
            case E:
                vowel = true;
                break;
            case I:
                vowel = true;
                break;
            case O:
                vowel = true;
                break;
            case U:
                vowel = true;
                break;
            default:
                vowel = false;
                break;
        }
        return vowel;
    }

    public static boolean isVowel32(char letter) { //The second variant of isVowel3
        boolean vowel;
        switch (letter) {
            case 97:
                vowel = true;
                break;
            case 101:
                vowel = true;
                break;
            case 105:
                vowel = true;
                break;
            case 111:
                vowel = true;
                break;
            case 117:
                vowel = true;
                break;
            default:
                vowel = false;
                break;
        }
        return vowel;
    }

    public static boolean isVowel4(char letter) { //The fourth variant
        boolean vowel = false;
        if (letter == A) {
            vowel = true;
        }
        if (letter == E) {
            vowel = true;
        }
        if (letter == I) {
            vowel = true;
        }
        if (letter == O) {
            vowel = true;
        }
        if (letter == U) {
            vowel = true;
        }
        return vowel;
    }

    public static boolean isVowel5(char letter) { //The fifth variant
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(String.valueOf(letter));
        return m.matches();
    }

    public static boolean isVowel6(char letter) { //The sixth variant
        char[] vowels = {A, E, I, O, U};
        boolean vowel = false;
        for (char c : vowels) {
            if (c == letter) {
                vowel = true;
            }
        }
        return vowel;
    }

}
