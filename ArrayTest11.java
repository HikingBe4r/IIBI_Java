/*	Obj: 학생수 50명(5명으로 줄임), 과목수 3과목(국영수)
		각 학생별 총점과 평균을 구하는 프로그램.
*/

//import, Package

public class ArrayTest11{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		int[][] student = new int[5][3];	// 50명의 3과목
		int[] total = new int[student.length];
		double[] avg = new double[student.length];

		int[] total2 = new int[student.length];
		double[] avg2 = new double[student.length];



		for(int count = 0; count < student.length; count++) {
			System.out.printf("%d:\t", count);
			for(int subject = 0; subject < student[count].length; subject++) {
				student[count][subject] = count*subject*10;
				System.out.printf("%d  ", student[count][subject]);

				total[count] += student[count][subject];
				avg[count] = (double) total[count] / student[count].length;
			}
			System.out.println();
		}

		for(int count = 0; count < student.length; count++) {
			System.out.printf("%d:\t총점: %d, \t평균: %.2f\n", count, total[count], avg[count]);
		}

	}
}