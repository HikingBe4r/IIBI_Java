// 패키지 선언
package a;

class A {
	// 인스턴스 변수
	private int num;

	// 생성자
	private A() {}
	private A(int _num) {
		this.num = _num;
	}

	public int getNum() {
		return num;
	}
}