/*	Obj: 
	
*/

//import, Package

public class ArrayTest1{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		int studentNum = 9;
		int[] score = new int[studentNum];

		// init array�� �ʿ䰡����..?
		for(int i = 0; i < studentNum; i++) {
			//score[i] = i*10;
			System.out.printf("hashcode: %s\tscore[%d]: %d\n", score, i, score[i]);
		}
		System.out.printf("�迭�� ����: %d\n", score.length);
	}
}