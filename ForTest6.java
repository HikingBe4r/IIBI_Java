/*	Obj: 
*/

public class ForTest6{

	// main method
	public static void main(String[] args) {
		
		for(int i = 0; i < 26; i++) {
			System.out.printf("%c%n", 'a'+i);
		}

		System.out.printf("---------------------%n");

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}
}