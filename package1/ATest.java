package b;

import a.A;
// import java.lang.*; // 이게 생략됨. 기본적으로.
public class ATest{
	public static void main(String[] args) {
		A obj = new A(5);
		System.out.printf("%d\n", obj.getNum());

	}
}