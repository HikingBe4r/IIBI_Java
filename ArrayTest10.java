/*	Obj: 1. 향상된 for문을 이용해 점수를 출력하라.
		 2. 총점 및 평균을 구해 출력하라.
	
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

		System.out.printf("총점: %d, 평균: %.2f\n", total, avg);
	}
}