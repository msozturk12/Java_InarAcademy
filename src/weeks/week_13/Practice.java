package weeks.week_13;

import java.math.BigInteger;

public class Practice {
    public static void main(String[] args) {

        //Wrapper Class
        Integer number1 = new Integer(34);
        Integer number2 = new Integer(34);


        System.out.println(number1 + number2);
        // has Relationship - Is RelationShip

        //StringBuilder

        String a = "Tarik";
        String b = "Tarik";

        System.out.println();

        ////String ımmutable class
        String c = "Tarik";
        c = "Inar";


        //StringBuilder

        StringBuilder sb1 = new StringBuilder("Tarik");
        sb1.append(" Inar");
        System.out.println(sb1.toString());
        sb1.delete(1,5);
        System.out.println(sb1.toString());
        System.out.println("-----------------------------");

        //Time complexity - Space Complexity
        String s1 ="Tarık";
        s1 += " Inar";
        System.out.println(s1);

        System.out.println(Integer.MAX_VALUE);//public final static int
        System.out.println(Integer.MAX_VALUE +1);//public final static int

        BigInteger max = new BigInteger(String.valueOf(Integer.MAX_VALUE));
        BigInteger bir = new BigInteger("1");
        max = max.add(bir);
        System.out.println(max);

        max = max.multiply(max);
        System.out.println(max);



    }


}
