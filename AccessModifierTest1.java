/*	Obj: 접근지정자에 대한 예제
	
*/
public class AccessModifierTest1 {
	public static void main(String[] args) {
		// 자동차 객체 선언 및 생성
		Car car1 = new Car("K5", "기아", "중형", "흰색");

		// 자동차명 조회
		System.out.printf("자동차명: %s\n", car1.getName());	// private String name
		
		
	}
}