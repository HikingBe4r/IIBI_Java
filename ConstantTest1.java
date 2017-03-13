class A {
	int num;

	A() {
	
	}

	A(int num) {
		this.num = num;
	}

	public final void ma() {
		System.out.println("call ma");
	}
}

class B extends A{
	int num1;

	B() {
	
	}

	B(int num, int num1) {
		super(num);
		this.num1 = num1;
	}

	public void mb() {
		System.out.println("call mb");
	}

	public void ma() {
		System.out.println("call Method Overriding");
	}
}

public class ConstantTest1{
	public static void main(String[] args) {
		B obj = new B(1,2);
		obj.ma();
		obj.mb();
		
	}
}