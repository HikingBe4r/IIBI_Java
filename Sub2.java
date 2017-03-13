/*	Obj: 주민등록번호 뒷번호 1, 3이면 남자, 2, 4면 여자입니다 출력.
	
*/

//import, Package

public class Sub2{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		int[] num = {7,9,0,6,0,8,'-',2,5,5,2,4,1,6};	// 주민등록번호
		
		for(int i = 0; i < num.length; i++) {
			if(i==6) {
				System.out.printf("-");
			} else {
				System.out.printf("%d", num[i]);
			}
		}
		
		
		if(num[7] == 1 || num[7] == 3) {
			//남자
			System.out.println("남자입니다.");
		} else if(num[7] == 2 || num[7] == 4) {
			//여자
			System.out.println("여자입니다.");
		} else {
			//잘못된 주민등록번호.
			System.out.println("잘못된 번호입니다.");
			
		}

	}
}
