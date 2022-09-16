package weeks.week_04;

public class NoVowelCharacters {

	public static void main(String[] args) {

		
		String s = "Inar Academy";
		
		int l = s.length();
		
		String result = "";
		
		for(int i = 0 ; i< l ; i++) {
			char harf = s.toLowerCase().charAt(i);
			
			if(harf != 'a' && harf !='e' && harf !='o' && harf !='u' && harf !='i'  ) {
				
				result = result + s.charAt(i);
				
				
			}
		
		}
		
		System.out.print(result);
	}
	
	
	
}
