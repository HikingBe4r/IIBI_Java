// 문자형 데이터 타입 예제
public class ASCIITest1 {
	public static void main(String[] args) {
		//변수 선언 및 초기화

		/*
		System.out.println("===========ASCII CODE==============");
		
		for(int i = 0; i < 128; i++) {
			System.out.printf("%d: %c	", i, i);
			if( i % 5 == 4)
				System.out.println("");
		}
		*/

		int num = 97;	
		
		System.out.println(Integer.toBinaryString(num));	// 2진수 출력방법. 16진수: Integer.toHexString(변수)
		System.out.printf("ASCII: %c%n", num);

		char c1 = '\u0061';
		System.out.printf("UniCode: %c%n", c1);


	}
}
