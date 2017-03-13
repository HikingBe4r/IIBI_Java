// 다중 선택 if문
public class IfTest8{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		int day = 71;	// 1,2,3,4,5,6,7

		if(day == 1) {
			System.out.println("일요일입니다.");
		} else if(day == 2) {
			System.out.println("월요일입니다.");
		} else if(day == 3) {
			System.out.println("화요일입니다.");
		} else if(day == 4) {
			System.out.println("수요일입니다.");
		} else if(day == 5) {
			System.out.println("목요일입니다.");
		} else if(day == 6) {
			System.out.println("금요일입니다.");
		} else if(day == 7) {
			System.out.println("토요일입니다.");
		} else {
			System.out.println("1~7사이의 숫자를 입력하세요.");
		}


	}
}
