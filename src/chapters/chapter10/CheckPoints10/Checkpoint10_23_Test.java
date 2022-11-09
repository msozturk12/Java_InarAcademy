package chapters.chapter10.CheckPoints10;

public class Checkpoint10_23_Test {

    String text;

    public  void Checkpoint10_23_Test(String s) {
        text = s;
    }

    public static void main(String[] args) {
        Checkpoint10_22_Test test = new Checkpoint10_22_Test("ABC");
        System.out.println(test);
    }
//The constructor is defined incorrectly. It should not have void.
}
