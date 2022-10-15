package weeks.week_09;


import java.util.Scanner;

public class isUniqCharacter1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a string value :");
        String str = input.nextLine();

        boolean result = isUniq(str);
        System.out.println("your string is " + str + " and it is isUniq: " + result);
        System.out.println("---------------------------------------------------------------");

        boolean result2 = isUniq1(str);
        System.out.println("your string is " + str + " and it is isUniq: " + result2);


    }

    private static boolean isUniq1(String str) {
        int counter = 0;
        boolean[] myAsciiTable = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            counter++;
            if (myAsciiTable[index]) {
                System.out.println("this is the step number : " + counter);
                return false;
            } else {
                myAsciiTable[index] = true;
            }
        }
        System.out.println("this is the step number : " + counter);
        return true;
    }

    public static boolean isUniq(String str) {
        int counter = 0;
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                counter++;
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("this is the step number : " + counter);
                    return false;
                }

            }

        }
        System.out.println("this is the step number : " + counter);
        return true;

    }
}
