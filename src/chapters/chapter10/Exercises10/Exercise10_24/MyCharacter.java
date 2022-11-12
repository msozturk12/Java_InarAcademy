package chapters.chapter10.Exercises10.Exercise10_24;

import java.util.Arrays;

public class MyCharacter {
    private char ch;


    public MyCharacter(char ch) {
        this.ch = ch;
    }

    private char getChar() {
        return this.ch;
    }

    public static char getValueOf(MyCharacter ch) {
        return ch.getChar();
    }

    public  boolean toCompare(MyCharacter mc) {
        return this.ch == mc.getChar();

    }

    public static boolean isLetter(char ch) {
        return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch < 'z');
    }

    public static boolean isDigit(char ch) {
        return ('0' <= ch && ch <= '9');
    }

    public static boolean isLetterOrDigit(char ch) {
        return isDigit(ch) || isLetter(ch);
    }

    public static char toUpperCase(char ch) {
        if (isLetter(ch)) {
            return (char) (ch - 32);

        } else {
            return ch;
        }
    }

    public static char toLowerCase(char ch) {
        if (isLetter(ch)) {
            return (char) (32 + ch);
        } else {
            return ch;
        }
    }

    public static boolean isLowerCase(char ch) {
        return 'a' <= ch && ch <= 'z';
    }

    public static boolean isUpperCase(char ch) {
        return 'A' <= ch && ch <= 'Z';
    }

}
