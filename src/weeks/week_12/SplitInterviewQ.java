package weeks.week_12;

import chapters.chapter08.Exercises08.TwoDimensionalArrays;

import java.util.Arrays;

public class SplitInterviewQ {
    public static void main(String[] args) {

        String cv = "Tarık I am an java instructor java at Inar Academy  ı learn java "; // cv yazılacak
        String[] arr = cv.split("java");
       // for (int i = 0; i <arr.length ; i++) {
      //      System.out.println(arr[i]);

       // }

        System.out.println("The occurrence of java word is " + (arr.length-1));
        System.out.println(Arrays.toString(arr));

        findJava();

        TwoDimensionalArrays s = new TwoDimensionalArrays();
        s.print();

        char s2 = cv.charAt(5);
        System.out.println(s2);



    }
public static void findJava(){
    String cv = "Tarık: I am an java instructor java at Inar Academy, ı learn java lesson "; // cv yazılacak
    String[] arr = cv.split("java");
    System.out.println(arr.length-1);

}


}
