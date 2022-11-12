package chapters.chapter10.Exercises10.Exercise10_22;

public class MyString1Test {
    public static void main(String[] args) {



        MyString1 a = new MyString1(new char[]{'I', 'N', 'A', 'R'});
        System.out.println(a);
        System.out.println("a.charAt(2)-->"+a.charAt(2));
        System.out.println("a.length()-->"+a.length());
        System.out.println("a.substring(1,3)-->"+a.substring(1,3).toString());
        System.out.println("a.toLowerCase()-->"+a.toLowerCase().toString());

        MyString1 s = new MyString1(new char[]{'A','C','A','D','E','M','Y'});
        System.out.println("a.equals(s)-->"+a.equals(s));

        MyString1 c = MyString1.ValueOf(4214);
        System.out.println("MyString1.ValueOf(4214)-->"+ c);



    }
}
