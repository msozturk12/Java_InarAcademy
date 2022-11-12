package chapters.chapter10.Exercises10.Exercise10_27;

import java.util.Arrays;

public class MyStringBuilder1 {
    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public int length() {
        return this.s.length();
    }

    public char charAt(int index) {
        return this.s.charAt(index);
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        this.s = this.s + s.toString();
        return this;
    }

    public MyStringBuilder1 append(int i) {
        this.s = this.s + i;
        return this;
    }

    public MyStringBuilder1 toLowerCase() {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= this.s.charAt(i) && this.s.charAt(i) <= 'Z') {
                char ch = (char) (s.charAt(i) + 32);
                str += ch;
            } else {
                str += this.s.charAt(i);
            }

        }
        this.s = str;
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        if (begin < 0 || end > length() || begin > end) {
            System.out.println("Invalid input");
            System.exit(1);
        }
        String output = "";
        for (int i = begin; i < end; i++) {
            output += this.s.charAt(i);

        }
        this.s = output;
        return this;
    }

    public String toString() {
        return this.s;
    }
}
