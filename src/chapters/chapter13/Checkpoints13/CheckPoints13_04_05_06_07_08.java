package chapters.chapter13.Checkpoints13;

public class CheckPoints13_04_05_06_07_08 {
    public static void main(String[] args) {
        Number x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(((Integer)x).compareTo(new Integer(4)));

    }
    /*  CheckPoints13_04-->
        Number numberRef = new Integer(0);
        Double doubleRef = (Double)numberRef; --> it causes classCastException

        CheckPoints13_05-->
            Number[] numberArray = new Integer[2];
            numberArray[0] = new Double(1.5);    -->because numberArray's type is Integer
                                                    when executed, it gives ArrayStoreException
        CheckPoints13_06-->
            public class Test {
            public static void main(String[] args) {
                Number x = 3;
                System.out.println(x.intValue());
                System.out.println(x.doubleValue());

            }
        }                    output--> 3
                                       3.0


         CheckPoints13_07-->
              public class Test {
                public static void main(String[] args) {
                    Number x = new Integer(3);
                    System.out.println(x.intValue());
                    System.out.println(x.compareTo(new Integer(4))); -->Number class doesn't have compareTo method
                }
              }

      CheckPoints13_08-->
             public class Test {
                public static void main(String[] args) {
                    Number x = new Integer(3);
                    System.out.println(x.intValue());
                    System.out.println((Integer)x.compareTo(new Integer(4)));
                }
            }
    -->The program has a syntax error because the member access operator (.) is executed before the casting operator.
     */


}

