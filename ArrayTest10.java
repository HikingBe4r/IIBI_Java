/*	Obj: 1. ���� for���� �̿��� ������ ����϶�.
		 2. ���� �� ����� ���� ����϶�.
	
*/

//import, Package

public class ArrayTest10{
	// Global variable

	
	// main method
	public static void main(String[] args) {
		// Local variable
		int[] score = {98, 69, 94, 55, 50, 88};
		int total=0;

		for(int i: score) {
			System.out.printf("%d ", i);
			total += i;
		}
		System.out.println();

		double avg = (double) total / score.length;

		System.out.printf("����: %d, ���: %.2f\n", total, avg);
	}
}