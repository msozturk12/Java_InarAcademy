package chapters.chapter09.checkPoints09;

public class Checkpoints09_31 {
    private static int i = 0;
    private static int j = 0;
    public static void main(String[] args) {
        int i = 2;
        int k = 3;
        {
            int j = 3;
            System.out.println("i + j is " + i + j); //i + j is 23
        }
        k = i + j;
        System.out.println("k is " + k);//k is 2
        System.out.println("j is " + j);//j is 0
    }
}
