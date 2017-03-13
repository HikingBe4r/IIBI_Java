/*	Obj: 
	
*/

//import, Package
import java.util.Scanner;

public class GUGUDAN{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		for(int i = 2; i <= 9; i++) {
			System.out.printf("=== %d´Ü ===%n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}

		}
	}
}
