package chapters.chapter09.checkPoints09;

public class Checkpoints09_27 {
    public static void main(String[] args) {
        java.util.Date[] dates = new java.util.Date[10];
        System.out.println(dates[0]);//there is no initilization so it is  null
        System.out.println(dates[0].toString());
   // Line 5 causes a NullPointerException since it invokes toString() method from the null reference
    }
}
