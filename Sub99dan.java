/*	Obj: ������ ����� ���η� �Ͻÿ�.
	
*/

public class Sub99dan{

	// main method
	public static void main(String[] args) {
		
		// Local variable
		for (int i = 0; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if(i == 0) {
					System.out.printf("===%d��===\t", j);
				}
				else {
					System.out.printf("%d * %d = %d\t", j, i, j*i);
				}
			}
			System.out.println();
		}
	}
}