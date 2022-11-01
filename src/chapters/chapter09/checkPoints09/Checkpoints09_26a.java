package chapters.chapter09.checkPoints09;

import java.util.Date;

public class Checkpoints09_26a {
    public static void main(String[] args) {
        Date date = null;
        m1(date);
        System.out.println(date);
    }

    public static void m1(Date date) {
        date = new Date();
    }
}// output --> null
