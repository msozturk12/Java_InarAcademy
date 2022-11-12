package chapters.chapter10.Exercises10.Exercise10_28;

public class MyStringBuilder2 {

    private char[] chars;

    public MyStringBuilder2() {
        this(new char[0]);
    }

    public MyStringBuilder2(char[] chars) {
        this.chars = chars;
    }

    public MyStringBuilder2(String s) {
        this.chars = s.toCharArray();
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) { //char[] = Academy
        char[] result = new char[chars.length + s.length()];// Aca...Inardemy  2,Inar
        for (int i = 0; i < offset; i++) {
            result[i] = chars[i];
        }
        for (int i = offset, j = 0; j < s.length(); i++, j++) {//Aca-Inar...demy  2,Inar
            result[i] = s.charAt(j);
        }

        for (int i = offset + s.length(), j = offset; i < result.length; i++, j++) { //Aca-Inar-demy...  2,Inar
            result[i] = chars[j];

        }
        chars = result;
        return this;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public MyStringBuilder2 reverse() {
        char[] result = new char[chars.length];
        for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) { //mesut --> tusem
            result[j] = chars[i];

        }
        return new MyStringBuilder2(result);
    }

    public MyStringBuilder2 substring(int begin) {  // hol landa

        if (begin < 0 || begin > chars.length) {
            System.out.println("Invalid begin index!!!");
            System.exit(1);
        }
        char[] result = new char[chars.length - begin];

        for (int i = begin,j=0; i < chars.length; i++,j++) {
            result[j] = chars[i];

        }
        return new MyStringBuilder2(result);
    }

    public MyStringBuilder2 toUpperCase() {
        char[] upper = new char[length()];
        for (int i = 0; i < length(); i++) {
            if ('a' <= chars[i] && chars[i] <= 'z') {
                upper[i] = (char) (chars[i] - 32);
            } else {
                upper[i] = chars[i];

            }
        }
        return new MyStringBuilder2(upper);
    }

    public int length() {
        return chars.length;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < chars.length; i++) {
            output += chars[i];

        }
        return output;
    }
}
