package chapters.chapter12.CheckPoints12;

import java.util.Scanner;

public class Checkpoints12_8 {
    public static void main(String[] args) {
        System.out.println(1.0 / 0);
        myMethod();

/*
System.out.println(1 / 0);-->ArithmeticException

int[] list = new int[5];
System.out.println(list[5]);--->ArrayIndexOutOfBoundsException

String s = "abc";
System.out.println(s.charAt(3));--->StringIndexOutOfBoundsException

Object o = new Object();
String d = (String)o;--------------->ClassCastException

Object o = null;
System.out.println(o.toString());----->NullPointerException

System.out.println(1.0 / 0)--------->infinity
 */

    }
    public static void myMethod() throws ArrayIndexOutOfBoundsException,IndexOutOfBoundsException,ClassCastException{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your array size");
        int size = input.nextInt();
        int[] arr = new int[5];
        System.out.println(arr[size]);


    }
}