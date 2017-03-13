/*	Obj: 자동차를 구현한 클래스
	
*/

//import, Package

public class Car{

	// Instance Variable
	String name;		// 이름
	String company;		// 제조사
	String kind;		// 차종
	String color;		// 색상

	// Method

	// 이름: 색상 조회
	// 기능: 색상을 반환한다.
	public String getColor() {
		return color;
	}

	// 이름: 색상 변경
	// 기능: _color의 색상으로 변경한다.
	public String setColor(String _color) {
		this.color = _color;
	}


}