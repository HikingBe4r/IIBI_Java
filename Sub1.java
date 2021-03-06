/*	Obj: 문제1번. 배열에 주민등록번호 기억
					"790608-2552416"
					각 값에 234567 892345를 곱하고, (맨 마지막, '-'는 제외)
					결과를 모두 더한 뒤
					11 - (합 % 11) = 마지막자리수(6)이 되도록 해야한다.

					int[]보단 char[]을 쓰는게 일관성있다.
*/

//import, Package

public class Sub1{
	// Global variable

	// main method
	public static void main(String[] args) {

		// Local variable
		int[] num2 = {7,9,0,6,0,8,'-',2,5,5,2,4,1,6};	// 체크 할 주민등록번호
		int[] num3 = {2,3,4,5,6,7,0,8,9,2,3,4,5};		// 유효성 체크

		int[] result = new int[num3.length];	// 곱셈결과
		int sum = 0;		// 곱결과의 덧셈계산
		int check = 0;		// 체크계산

		for (int i = 0 ; i < num3.length; i++){
			result[i] = num2[i]*num3[i];

			sum += result[i];
		}

		check = (11-(sum%11))%10;

		System.out.printf("sum: %d, check: %d\n", sum, check);

		if(check == num2[num2.length-1]) {
			System.out.printf("유효한 주민등록번호 입니다.\n");
		} else {
			System.out.printf("잘못된 주민등록번호 입니다.\n");
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
			System.out.printf("유효한 주민등록번호 입니다.\n");
		} else {
			System.out.printf("잘못된 주민등록번호 입니다.\n");
		}
		System.out.printf("total: %d, result: %d\n", total, result);
		*/
	}
}