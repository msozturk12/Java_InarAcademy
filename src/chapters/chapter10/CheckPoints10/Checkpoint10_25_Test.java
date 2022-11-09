package chapters.chapter10.CheckPoints10;

public class Checkpoint10_25_Test {


    public static void main(String[] args) {
        String s = "Hi, Good Morning";
        System.out.println(m(s));
    }

    public static int m(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    //it counts capital words in the string so the output is--> 3
}
