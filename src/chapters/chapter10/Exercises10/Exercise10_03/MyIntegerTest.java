package chapters.chapter10.Exercises10.Exercise10_03;

public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger t1= new MyInteger(25);

        System.out.println("getValues()--> " + t1.getValues());
        System.out.println("isEven()--> " +t1.isEven());
        System.out.println("isOdd()--> " + t1.isOdd());
        System.out.println("isPrime()--> " +t1.isPrime());
        System.out.println();

        System.out.println("isEven(36) " + t1.isEven(36));
        System.out.println("isOdd(26) "+t1.isOdd(26));
        System.out.println("isPrime(51)"+t1.isPrime(51));
        System.out.println();

        System.out.println("isEven(new MyInteger(366)) "+ t1.isEven(new MyInteger(366)));
        System.out.println("isOdd(new MyInteger(2222)) "+ t1.isOdd(new MyInteger(2222)));
        System.out.println("isPrime(new MyInteger(4214)) "+t1.isPrime(new MyInteger(4214)));
        System.out.println();

        System.out.println("equals(89)--> "+t1.equals(89));
        System.out.println("t1.equals(new MyInteger(25)--> "+t1.equals(new MyInteger(25)));
        System.out.println();

        char[] ch = {'1','2','3','4'};
        int num = MyInteger.parseInt(ch);
        System.out.println("char[]{'1','2','3','4'} parseInt-->" +num);


        String str ="4561";
        int num2 = MyInteger.parseInt(str);
        System.out.println("parseInt(4561)-->"+num2);

    }
}
