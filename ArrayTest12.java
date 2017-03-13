/*	Obj: 
	
*/

//import, Package

public class ArrayTest12{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		int[][] score = {{50, 55, 45, 52}, {100, 100, 100, 100}};
		int[] total = new int[2];
		double[] avg = new double[2];


		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
				total[i] += score[i][j];
			}
			avg[i] = (double)total[i] / score[i].length;
			System.out.printf("ÃÑÁ¡: %d, Æò±Õ: %.2f", total[i], avg[i]);
			System.out.println();
		}

		System.out.println("---------------------------==============================--");

		int total2;
		double avg2;

		for(int[] arr: score) {

			total2 = 0;

			for(int a: arr) {
				total2 += a;
				System.out.printf("%d\t", a);
			}
			avg2 = (double)total2 / arr.length;
			System.out.printf("ÃÑÁ¡: %d, Æò±Õ: %.2f", total2, avg2);
			System.out.println();
		}
	}
}
