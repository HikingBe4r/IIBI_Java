// inner class에 대한 프로그램

class Outer {	// Outer.class
	private int num1 = 5;
	int num2 = 10;
	
		private static int num4 = 20;

	private Inner inner = new Inner();

	public void printOuter() {
		System.out.printf("num1: %d, num2: %d, num3: %d\n", num1, num2, inner.num3);
		//System.out.printf("num1: %d, num2: %d, num3: %d\n", inner.num1, inner.num2, inner.num3);
		
	}


	class Inner {	// Outer$Inner.class
		private int num3 = 15;

		//private static int num4 = 20;

		public Inner() {
			
		}

		public void printInner() {
			System.out.printf("num1: %d, num2: %d, num3: %d\n", num1, num2, num3);
			System.out.printf("num1: %d, num2: %d, num3: %d\n", Outer.this.num1, Outer.this.num2, num3);
			System.out.printf("num4: %d\n", num4);
			System.out.printf("Outer.num4: %d\n", Outer.num4);
		}

		public void in() {
			printOuter();
		}


		// instance method
		public void printOuter() {
			System.out.println("오버라이딩?");
		}
	
	}
}



public class NestedClassTest1{
	public static void main(String[] args) {
		Outer o = new Outer();
		
		Outer.Inner i = o.new Inner();

//		System.out.println(o);
//		System.out.println(i);
		
		i.printInner();
		i.printOuter(); // 왜 안되냐
		i.in();
		o.printOuter();

	}
}