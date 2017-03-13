/*	Obj: 
	
*/

//import, Package

public class ContinueTest2{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable

		for(int i = 0; i < 10; i++) {
			if(i %2 != 0) {
				continue;
			}
			System.out.printf("i: %d\n", i);
		}
	}
}
