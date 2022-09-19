package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class OBEB {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);

		/**ortak bölenlerin en büyüğü
		 * 4 2 --->2
		 * 16 24 --->8
		 * 1-number1 and number2 input
		 * 2-karşılaştırıp küçük değeri bulucam min e atıcam
		 * 3-int k = 1 ---> bölme    k<min ;  k++
		 *				---> if(number1%k == 0 && number2%k ==0
		 *						--->gsd=k;
		 * write it
		 */
		System.out.println("---GREATEST COMMON DIVISOR---");
		System.out.println("Enter  number1 ");
		int number1= input.nextInt();
		System.out.println("Enter  number2 ");
		int number2= input.nextInt();

		int min=0;
		if(number1<number2){
			min=number1;
		}else{
			min=number2;
		}

		int obeb = 0;

		for(int d=2; d < min ; d++){
			if((number1 % d == 0) && (number2 % d == 0 )){
				obeb=d;
			}
		}

		System.out.printf("the gcd for %d and %d is %d ",number1,number2,obeb);






	}

}
