/*	Obj: 1. for���� �̿��� ������ ����϶�.
		 2. ���� �� ����� ���� ����϶�.
	
*/

//import, Package

public class ArrayTest9{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		int[] score = {98, 69, 94, 55, 50, 88};
		int total=0;
		double avg;

		for(int i = 0; i < score.length; i++) {
			System.out.printf("%d: %d\n", i, score[i]);
			total += score[i];
		}

		avg = (double) total / score.length;

		System.out.printf("����: %d, ���: %.2f\n", total, avg);

	}
}