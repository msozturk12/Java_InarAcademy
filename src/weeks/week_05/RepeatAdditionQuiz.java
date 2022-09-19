package weeks.week_05;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        /**iki sayı alıncak(random)1-10
         *
         * toplanacak ve kullanıcıdan cevaplanması istenecek
         * dogru olana kadar sorulmaya devam edilecek
         *eger bilirse congrat
         * bilemezse again please
         *
         */
        Scanner input = new Scanner(System.in);

        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);

        System.out.printf("What is the result %d + %d ? " , number1,number2);
        int answer =input.nextInt();
        int result=number1 + number2;

        while(result!=answer){
            System.out.println("wrong answer please try again");
            System.out.printf("What is the result %d + %d ? " , number1,number2);
            answer =input.nextInt();
        }
        System.out.println("congrat");
    }
}
