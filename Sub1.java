/*	Obj: ����1��. �迭�� �ֹε�Ϲ�ȣ ���
					"790608-2552416"
					�� ���� 234567 892345�� ���ϰ�, (�� ������, '-'�� ����)
					����� ��� ���� ��
					11 - (�� % 11) = �������ڸ���(6)�� �ǵ��� �ؾ��Ѵ�.

					int[]���� char[]�� ���°� �ϰ����ִ�.
*/

//import, Package

public class Sub1{
	// Global variable

	// main method
	public static void main(String[] args) {

		// Local variable
		int[] num2 = {7,9,0,6,0,8,'-',2,5,5,2,4,1,6};	// üũ �� �ֹε�Ϲ�ȣ
		int[] num3 = {2,3,4,5,6,7,0,8,9,2,3,4,5};		// ��ȿ�� üũ

		int[] result = new int[num3.length];	// �������
		int sum = 0;		// ������� �������
		int check = 0;		// üũ���

		for (int i = 0 ; i < num3.length; i++){
			result[i] = num2[i]*num3[i];

			sum += result[i];
		}

		check = (11-(sum%11))%10;

		System.out.printf("sum: %d, check: %d\n", sum, check);

		if(check == num2[num2.length-1]) {
			System.out.printf("��ȿ�� �ֹε�Ϲ�ȣ �Դϴ�.\n");
		} else {
			System.out.printf("�߸��� �ֹε�Ϲ�ȣ �Դϴ�.\n");
		}

		


		//=============================================================
		//		 0  1  2  3  4  5  6  7  8  9  
		// 0~9 : 48 49 50 51 52 53 54 55 56 57

		/*
		char[] ssn = {'7','9','0','6','0','8','-','2','5','5','2','4','1','6'};
		int[] check ={ 2 , 3 , 4 , 5 , 6 , 7 , 0 , 8 , 9 , 2 , 3 , 4 , 5 };
		int total = 0;

		for(int i = 0; i < check.length; i++) {
			total += (int)(ssn[i]-48) * check[i];
		}
		int result = 11 - (total%11);
		if(result == ssn[ssn.length-1]-48) {
			System.out.printf("��ȿ�� �ֹε�Ϲ�ȣ �Դϴ�.\n");
		} else {
			System.out.printf("�߸��� �ֹε�Ϲ�ȣ �Դϴ�.\n");
		}
		System.out.printf("total: %d, result: %d\n", total, result);
		*/
	}
}