/*	Obj: 
	
*/

//import, Package

public class ArrayTest4{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		String[] array = new String[3];
		
		array[0] = "�ϱ浿";
		array[1] = "�̱浿";
		array[2] = "��浿";
			
		for(int i = 0; i < array.length; i++) {
			System.out.printf("array[%d]: %s\n", i, array[i]);

		}
	}
}