package weeks.week_05;

import java.util.Scanner;

public class week05_02 {
    public static void main(String[] args) {

        /**
         * 5 kere soru soruluyor
         * bi soru için bilemediği taktirde 3 hakkı var sonra diğer soruya geçiyor
         */


        Scanner input = new Scanner(System.in);
        int soru = 0;

        while(soru <5){

        soru++;
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);

        int result= number1 + number2;
        int counter=0;
        int cevap=-1;

        while(cevap != result && counter<3){
            System.out.printf("what is the result of %d + %d ? ", number1 , number2);
            cevap=input.nextInt();
            if(cevap == result){
                System.out.println("congrat");
            }else{
                System.out.println("try again");
            }
            if(cevap!=result && counter ==1){
                System.out.printf("what is the result of %d + %d ? ", number1 , number2);
                cevap=input.nextInt();
                if(cevap == result){
                    System.out.println("congrat");
                }else{
                    System.out.println("you try three times and you cant know the answer");
                    break;
                }

            }
            counter++;
        }
            soru++;
        }
        System.out.println("you answered 5 question and your test finished");
    }
}
