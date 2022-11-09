package chapters.chapter10.CheckPoints10;

public class CheckPoint10_11_12 {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("10"));           //10
        System.out.println(Integer.parseInt("10", 10));//10
        System.out.println(Integer.parseInt("10", 16));//16
        System.out.println(Integer.parseInt("11"));          //11
        System.out.println(Integer.parseInt("11", 10));//11
        System.out.println(Integer.parseInt("11", 16));//17 (16lık tabanda 11 se 10luk tabanda 17 oluyor)

        System.out.println("new Double(12.5).intValue() --> " +new Double(12.5).intValue());

        Integer x = 3 + new Integer(5);
        Integer y =3;
       // Double z = 3;
        int i = new Integer(3);
        int sum = new Integer(3) + new Integer(4);
        System.out.println(sum);


    }
}
/*
a. Integer x = 3 + new Integer(5);  correct
b. Integer x = 3;   correct
c. Double x = 3; -->have o write double value
d. Double x = 3.0;   correct
e. int x = new Integer(3);
f. int x = new Integer(3) + new Integer(4);

 */