package chapters.chapter03.Checkpoint03;

public class Checkpoint_03_40 {
	
	public static void main(String[] args) {

		
		//	Is (x > 0 && x < 10) the same as ((x > 0) && (x < 10))?	yes
		// Is (x > 0 || x < 10) the same as ((x > 0) || (x < 10))? yes
		
		
		int x=5;
		int y=20;
		
		System.out.println((x > 0 || x < 10 && y < 0));
		System.out.println(x > 0 || (x < 10 && y < 0)); //yes,they are same

		
	}

}
