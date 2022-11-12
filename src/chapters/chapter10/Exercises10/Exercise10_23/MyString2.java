package chapters.chapter10.Exercises10.Exercise10_23;

import java.util.Arrays;

public class MyString2 {

    private char[] chars;

    public MyString2(String s) {
        chars = s.toCharArray();
    }

    public MyString2(char[] chars) {
        this.chars = chars;
    }

    public char[] toChars() {
        return this.chars;
    }

    public int compare(String s) {
        if (chars.length < s.length()) {
            return -1;
        } else if (chars.length == s.length()) {
            return 0;
        } else {
            return -1;
        }

    }

    public MyString2 substring(int begin) {
        if (begin < 0 || begin > chars.length - 1) {
            System.out.println("Invalid input!!!");
            System.exit(-1);
        }
        char[] result = new char[chars.length-begin];
        for (int i = begin, j = 0; i < chars.length; i++, j++) {
            result[j] = chars[i];

        }
        return new MyString2(result);
    }

    public MyString2 toUpperCase() {
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if ('a' <= chars[i] && chars[i] <= 'z') {
                result += (char) (chars[i] - 32);//ASCII table z-Z:32
            }else{
                result+=chars[i];
            }

        }
        return new MyString2(result);
    }

    public static MyString2 valueOf(boolean b) {
        if (b) {
            return new MyString2("true");
        } else {
            return new MyString2("false");
        }
    }

    public String toString() {
        return Arrays.toString(chars);
    }
}