package chapters.chapter06.Listing06;

public class NPrintlnMethod {
    public static void main(String[] args) {
        nPrintln("merhabalar java!", 10);
    }

    private static void nPrintln(String str, int döngüSayısı) {

        for (int j = 0; j < döngüSayısı; j++) {
            System.out.println(str);
        }


    }

}
