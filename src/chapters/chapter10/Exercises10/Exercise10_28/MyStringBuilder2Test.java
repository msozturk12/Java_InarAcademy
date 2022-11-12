package chapters.chapter10.Exercises10.Exercise10_28;

public class MyStringBuilder2Test {
    public static void main(String[] args) {
        MyStringBuilder2 msb1 = new MyStringBuilder2(new char[]{'A','C','A','D','E','M','Y'});
        System.out.println(msb1);
        MyStringBuilder2 msb2 = new MyStringBuilder2("hope");
        msb1.insert(3,msb2);
        System.out.println("msb1.insert(3,msb2)-->" +msb1);
        System.out.println("msb1.reverse()-->"+msb1.reverse());

        MyStringBuilder2 a = new MyStringBuilder2(new char[]{'S','P','A','C','E'});
        System.out.println("a.substring(2)-->" +a.substring(1));

        MyStringBuilder2 u = new MyStringBuilder2("uppercase");
        System.out.println("u.toUpperCase()-->"+u.toUpperCase());

        System.out.println("msb2.substring(5)-->" +msb2.substring(5));



    }
}
