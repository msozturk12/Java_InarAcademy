package chapters.chapter10.CheckPoints10;

public class CheckPoint10_09 {

    public static void main(String[] args) {
        System.out.println("Integer to String");

        int a = 5;
        String s = "onNumara " + a + " yıldız";
        System.out.println(s);

        int b = 214;
        Integer.toString(b);
        System.out.println(b);

        System.out.println("Numeric string to an Integer");
        int number = Integer.parseInt("4214");
        System.out.println("Integer.parseInt(\"4214\"-->) " + number);
        Integer i1 = Integer.valueOf("4220");
        System.out.println("Integer.valueOf(\"4220\"-->) " + i1);
        System.out.println(number +6);

        double d = Double.parseDouble("12.5");
        double v = Double.valueOf("45.5");


    }
}
