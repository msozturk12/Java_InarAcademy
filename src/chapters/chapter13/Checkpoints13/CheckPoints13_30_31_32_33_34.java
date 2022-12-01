package chapters.chapter13.Checkpoints13;

import chapters.chapter13.Listing13.Rational;

public class CheckPoints13_30_31_32_33_34 {
   /*
   CheckPoints13_30
        Rational r1 = new Rational(-2, 6);
        System.out.println(r1.getNumerator()); -->-1
        System.out.println(r1.getDenominator());-->3
        System.out.println(r1.intValue());--->0
        System.out.println(r1.doubleValue());-->-0.33333333333333333

    CheckPoints13_31-->
       Rational r1 = new Rational(-2, 6);
       Object r2 = new Rational(1, 45);
       System.out.println(r2.compareTo(r1)); -->Object doesn't have compareTo method so it cant compile

    CheckPoints13_32-->
      Object r1 = new Rational(-2, 6);
      Rational r2 = new Rational(1, 45);
      System.out.println(r2.compareTo(r1)); -->Object class is not comparable

    CheckPoints13_33-->
       How do you simplify the code in lines 82–85 in Listing 13.13 Rational.java using one
       line of code without using the if statement?
       -->   return (this.subtract((Rational) other)).getNumerator() == 0;

    CheckPoints13_34-->
      Rational r1 = new Rational(1, 2);
      Rational r2 = new Rational(1, -2);
      System.out.println(r1.add(r2));  --->output is 0/4


    */

}
