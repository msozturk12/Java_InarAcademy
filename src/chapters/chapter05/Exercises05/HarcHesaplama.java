package chapters.chapter05.Exercises05;

public class HarcHesaplama {
	public static void main(String[] args) {
		
		double harc= 10_000;
		int yıl = 0;
		
		while(harc< 20_000) {
			harc*=1.07;
			yıl++;
			
		}
	System.out.printf(yıl + " yıl sonra harc " + harc );
	}
	

}
