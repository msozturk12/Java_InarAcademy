package chapters.chapter12.CheckPoints12;

public class Checkpoints12_24 {
    public static void main(String[] args) {

        try {
            method1();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    public static void method1() throws Exception {
        try {
            method2();

        } catch (Exception ex) {
            throw new Exception("New info from method1");

        }

    }

    public static void method2() throws Exception {
        throw new Exception("New info from method2");
    }
}
/*
output-->
java.lang.Exception: New info from method1
	at chapters.chapter12.CheckPoints12.Checkpoints12_24.method1(Checkpoints12_24.java:20)
	at chapters.chapter12.CheckPoints12.Checkpoints12_24.main(Checkpoints12_24.java:7)
 */
