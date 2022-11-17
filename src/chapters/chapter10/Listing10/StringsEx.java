package chapters.chapter10.Listing10;

import java.util.Date;

public class StringsEx {
    public static void main(String[] args) {
        String s = "Java";
        String c = "Java";
        System.out.println(s.charAt(2));

        String s1 = "a+b$#c".replaceAll("[$+#]", "NNN");
        System.out.println(s1);

        String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
        char[] ch = tokens[0].toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            System.out.print(ch[i] + " ");

        }

        System.out.println("\n----Conversion between String and Arrays---------");

        char[] chars = "Java".toCharArray();
        System.out.println(chars[0]);

        /*
        To convert an array of characters into a string, use the String(char[]) constructor or
        the valueOf(char[]) method.
         */
        System.out.println("------------------------------");
        System.out.println(new Date().toString());

        String replace = "Welcome".replace('e', 'A');
        System.out.println(replace);

        System.out.println("welcome".replaceFirst("e", "AS"));

        System.out.println();
        System.out.println("Java is fun".matches("Java......."));
        System.out.println("Java is cool".matches("Java.*"));
        System.out.println("Java is powerful".matches("Java.*"));


        String s11 = "Welcome to Java";
        String s2 = s11;
        System.out.println("-->" + (s11==s2));
        System.out.println(s11.toCharArray());
    }


}
