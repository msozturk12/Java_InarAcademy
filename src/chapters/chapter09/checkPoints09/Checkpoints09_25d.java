package chapters.chapter09.checkPoints09;

public class Checkpoints09_25d {
    public static void main(String[] args) {
        W w1= new W();
        W w2 = new W();
        System.out.println("w1's i = " +
                w1.i + " and j = " + w1.j);
        System.out.println("w2's i = " +
                w2.i + " and j = " + w2.j);

    }
}
class W {
    static int i = 0;
    int j = 0;
    W() {
        i++;
        j = 1;
    }
}