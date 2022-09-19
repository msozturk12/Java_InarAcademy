package weeks.week_05;

import java.util.Scanner;

public class GuessingNumber {

    public static void main(String[] args) {
        //1-neyi tekrar ediyorum
        //2-ne kadar tekrar ediyorum

        /**
         * random sayı alıcam 0 ile 100 dahil
         * kullanıcı dahil edecek
         * hıgh/low diyerek yölendirecez
         */

        /**
         * 1- Neyi tekrar ediyoruz?
         *      kullanıcıya soru sormayı
         *      cevaba göre ipucu
         *  2-kullanıcı bilene kadar
         *
         */
        Scanner input = new Scanner(System.in);

        int number = (int) (Math.random() * 101);
        int guess=-1;
       while(number!=guess){
           System.out.println("Enter your guess number");
           guess=input.nextInt();
           if(number==guess){
               System.out.println("well done");
           }else if(guess>number){
               System.out.println("too high,please enter low number");
           }else{
               System.out.println("too low , please enter high number");
           }
       }
    }
}