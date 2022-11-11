package chapters.chapter10.CheckPoints10;

public class CheckPoints10_32 {
    public static void main(String[] args) {
        String s = "Java";
        StringBuilder builder = new StringBuilder(s);
        change(s, builder);
        System.out.println(s);
        System.out.println(builder);
    }

    private static void change(String s, StringBuilder builder) {
        s= s + " and HTML";
        builder.append(" and HTML");
    }
}
// Inside the method, the statement s = s + " and HTML" creates a new String object s,
// which is different from the original String object passed to the change(s, builder) method.
// The original String object has not been changed.
// Therefore, the output from the original string is Java. Inside the method,
// the content of the StringBuilder object is changed to Java and HTML.
// Therefore, the output from builder is Java and HTML