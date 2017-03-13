/*	Obj: 1차원배열 출력-> 향상된 for문
	
*/

//import, Package

public class ArrayTest7{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		String[] grade = {"일이", "삼사", "오륙", "칠팔", "구십"};

		for(String str: grade) {
			System.out.printf("%s\n", str);
		}

	}
}
