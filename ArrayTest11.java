/*	Obj: �л��� 50��(5������ ����), ����� 3����(������)
		�� �л��� ������ ����� ���ϴ� ���α׷�.
*/

//import, Package

public class ArrayTest11{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		int[][] student = new int[5][3];	// 50���� 3����
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
			System.out.printf("%d:\t����: %d, \t���: %.2f\n", count, total[count], avg[count]);
		}

	}
}