package chapters.chapter10.Exercises10.Exercise10_22;

import java.util.Arrays;

public class MyString1 {

    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > length() || begin > end) {
            System.out.println("invalid ınput!!!");

        }
        char[] newArr = new char[end - begin];
        for (int newIndex = 0, oldIndex = begin; newIndex < newArr.length; newIndex++, oldIndex++) {
            newArr[newIndex] = charAt(oldIndex);

        }
        return new MyString1(newArr);
    }

    public MyString1 toLowerCase() {
        char[] lowerChar = new char[length()];

        for (int i = 0; i < length(); i++) {
            if ('A' <= chars[i] && chars[i] <= 'Z') {
                lowerChar[i] = (char) (charAt(i) + 32);//'A'(65) + 32 = 'a'(97)

            } else {
                lowerChar[i] = charAt(i);
            }

        }
        return new MyString1(lowerChar);
    }

    public boolean equals(MyString1 s) {
        if (length() != s.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (charAt(i) != s.charAt(i)) {
                return false;
            }

        }
        return true;
    }

    public static MyString1 ValueOf(int i) {//2112-->convert to String
        int counter = 0;
        int number = i;
        while (number > 0) {
            number = number / 10;
            counter++;
        }
        char[] ch = new char[counter];

        for (int j = counter - 1; j >= 0; j--) {
            ch[j] = (char) ('0'+ i % 10);
            i = i / 10;

        }
        return new MyString1(ch);
    }


    public String toString() {
        return Arrays.toString(chars);


/*
        String output = "";
        for (int i = 0; i < chars.length; i++) {
            output += chars[i] + " ";
        }
        return output;
*/
    }

}
