/*	Obj: 학생 성적관리 프로그램
		번호	국어	영어	수학
		1		100		90		100
		2		80		70		85
		3		95		100		90
		4		50		40		35
		5		70		60		55

*/

//import, Package

public class Sub3{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		int[][] score = { 
			{100, 90, 100},
			{80, 70, 85}, 
			{95, 100, 90}, 
			{50, 40, 35}, 
			{70, 60, 55}
		};
		
		int[] total = new int[score[0].length];
		double[] avg = new double[score[0].length];

		System.out.printf("번호\t국어\t영어\t수학\n");

		for(int i = 0; i < score.length; i++) {
			System.out.printf("%d\t", i+1);
			for(int j = 0; j < score[i].length; j++) {
				total[j] += score[i][j];
				System.out.printf("%d\t", score[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < 2; i++) {
			if(i == 0)	System.out.printf("총점:\t");
			else if (i == 1) System.out.printf("평균:\t");

			for(int j = 0; j < total.length; j++) {
				if(i == 0) System.out.printf("%d\t", total[j]);
				else if (i == 1) System.out.printf("%.2f\t", avg[j]);
				
				avg[j] = (double) total[j] / score.length;
			}
			System.out.println();
		}
	}
}