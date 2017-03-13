/*	Obj: label break
	
*/

//import, Package

public class BreakTest2{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		

first:		for(int i = 0; i < 5; i++) {
second:			for(int j = 0; j < 3; j++) {
					if(i == 3) {
						break second;
					}
					System.out.printf("i: %d, j: %d\n", i, j);
				}
			}
	}
}
