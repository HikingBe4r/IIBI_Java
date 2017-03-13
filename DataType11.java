// 문자형 데이터 타입 예제
public class DataType11 {
	public static void main(String[] args) {
		//변수 선언 및 초기화
		char c1 = '0';		
		char c2 = 48;		// 아스키코드
		char c3 = '\u0030';	// 유니코드
		
		System.out.println(Integer.toString(c1));
		System.out.println(Integer.toHexString(c1));
		System.out.printf("c1: %c, c2: %c, c3: %c%n", c1, c2, c3);
	}
}
