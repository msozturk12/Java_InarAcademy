package chapters.chapter06.Listing06;

public class Increment {
    public static void main(String[] args) {

        int x = 5;
        System.out.println("x in metoda gnderilmeden önceki degerei : " + x);
        increment(x);
        System.out.println("x in incremet metoduna gönderildikten sonraki degeri : " + x);

    }

    static void increment(int x) {
        x++;
        System.out.println("Increment metodu içindeki n nin değeri " + x);
    }

}
