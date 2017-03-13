package b;
import a.A;
class B extends A {
	private int num1;

	B() {
		super();
	}
	B(int num, int num1) {
		super(num);
		this.num1 = num1;
	}

	public void print() {
		System.out.printf("num: %d\tnum1: %d\n", num, num1);
	}
}