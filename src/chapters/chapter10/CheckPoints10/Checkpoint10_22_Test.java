package chapters.chapter10.CheckPoints10;

public class Checkpoint10_22_Test {
    private String text;

    public Checkpoint10_22_Test(String s) {
        String text = s;  //if we write "this." instead of "String" code runs well...
    }

    public static void main(String[] args) {
        Checkpoint10_22_Test test = new Checkpoint10_22_Test("ABC");
        System.out.println(test.text.toLowerCase());
    }
}
//data field 's value of text is still null so, it gives nullPointerException