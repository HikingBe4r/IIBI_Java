/*	Obj: 
	
*/

//import, Package

public class ArrayTest4{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		String[] array = new String[3];
		
		array[0] = "일길동";
		array[1] = "이길동";
		array[2] = "삼길동";
			
		for(int i = 0; i < array.length; i++) {
			System.out.printf("array[%d]: %s\n", i, array[i]);

		}
	}
}
