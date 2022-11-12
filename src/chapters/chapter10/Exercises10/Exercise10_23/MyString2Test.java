package chapters.chapter10.Exercises10.Exercise10_23;



public class MyString2Test {
    public static void main(String[] args) {
        MyString2 s = new MyString2("InarAcademy");
        System.out.println(s);
        String q = "InarAcademy";
        System.out.println("s.compare(q)--> " +s.compare(q));
        System.out.println("s.compare(\"as\")--> " + s.compare("as"));
        System.out.println("s.compare(\"Inar\")--> " + s.compare("Inar"));
        System.out.println(s.substring(5).toString());
        System.out.println(s.toUpperCase().toString());
        System.out.println(MyString2.valueOf(true).toString());

    }
}
