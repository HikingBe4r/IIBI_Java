/*	Obj: break문 사용해보자
	
*/

//import, Package

public class BreakTest1{
	// Global variable

	// main method
	public static void main(String[] args) {
		// Local variable

		for(int i = 0; i < 10; i++) {
			System.out.println("i: "+i);
			if(i == 5) { 
				break;
			}
		}
	}
}