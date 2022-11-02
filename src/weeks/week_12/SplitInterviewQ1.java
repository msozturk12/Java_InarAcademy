package weeks.week_12;

import java.util.Scanner;

public class SplitInterviewQ1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        findJavaInCv();

        System.out.println("------------------------");
        System.out.println("Enter a word that you wanna learn the occurrence in your cv");
        String s = input.nextLine();
        findTheWordOccurrence(s);


    }

    private static void findJavaInCv() {
        String cv = "java java java ";
        String[] result = cv.trim().split("java");
        //whitespace : space, tab, newLine
        System.out.println(result.length);
    }

    private static void findTheWordOccurrence(String j) {
        String cv = "I work in google and i am using java now,i am the member of human resource team as a tester " +
                "and ı am using java, java is a life for me,i love java";

        String[] arr = cv.split(j);

        System.out.println(arr.length - 1);
    }
}