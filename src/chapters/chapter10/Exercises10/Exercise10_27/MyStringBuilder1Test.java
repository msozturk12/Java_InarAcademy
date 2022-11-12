package chapters.chapter10.Exercises10.Exercise10_27;

public class MyStringBuilder1Test {
    public static void main(String[] args) {

        MyStringBuilder1 a = new MyStringBuilder1("AliAtaBak");
        System.out.println("a.append(5)-->"+a.append(5));
        MyStringBuilder1 b = new MyStringBuilder1(" SDET");
        System.out.println("a.append(b)-->"+a.append(b));
        System.out.println("lenght is--> " + a.length());
        System.out.println("b.toLowerCase()-->"+b.toLowerCase());
        System.out.println("a.substring(2,10)-->"+a.substring(2,10));
    }
}
