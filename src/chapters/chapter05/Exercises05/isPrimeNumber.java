package chapters.chapter05.Exercises05;

public class isPrimeNumber {

	public static void main(String[] args) {

		int asalSayacı = 0;
		int sayı = 2;

		while (asalSayacı < 100) {				//100. asal sayı
			boolean asalMı = true;

			for (int i = 2; i < sayı/2; i++) {
				if (sayı % i == 0) {
					asalMı = false;
				}
			}
		if(asalMı == true) {
			asalSayacı++;
			System.out.println(asalSayacı + ". asal sayı:" + sayı );
		}
		sayı++;
		
		}

	}
}