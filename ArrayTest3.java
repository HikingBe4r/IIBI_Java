/*	Obj: 레퍼런스 할당을 해보자.
	
*/

//import, Package

public class ArrayTest3{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		char[] grade = new char[5];

		grade[0] = 'a';
		grade[1] = 'b';
		grade[2] = 'c';
		grade[3] = 'd';
		grade[4] = 'f';

		for(int index = 0; index < grade.length; index++) {

			System.out.printf("grade[%d]: %c\n", index, grade[index]);
		}
	
	}
}
